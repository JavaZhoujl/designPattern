package com.zhoujl.netty.rpc.consumer.proxy;

import com.zhoujl.netty.rpc.protocol.InvokerProtocol;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @Date: 2019年06月17日 下午 16:29
 * @author: zhoujl
 * @Version: 1.0
 */
public class RpcProxy {

	public static <T> T create(Class<?> clazz) {
		MethodProxy proxy = new MethodProxy (clazz);
		Class<?>[] interfaces = clazz.isInterface () ? new Class[]{clazz} : clazz.getInterfaces ();
		T result = (T) Proxy.newProxyInstance (clazz.getClassLoader (), interfaces, proxy);
		return result;
	}

	private static class MethodProxy implements InvocationHandler {

		private Class<?> clazz;

		public MethodProxy(Class<?> clazz) {
			this.clazz = clazz;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			//如果传进来是一个已实现的具体类（本次演示略过此逻辑)
			if (Object.class.equals (method.getDeclaringClass ())) {
				try {
					return method.invoke(this, args);
				} catch (Throwable t) {
					t.printStackTrace();
				}
				//如果传进来的是一个接口（核心)
			} else {
				return rpcInvoke (proxy, method, args);
			}
			return null;
		}

		private Object rpcInvoke(Object proxy, Method method, Object[] args) {
			//传输协议封装
			InvokerProtocol protocol = new InvokerProtocol ();
			protocol.setClassName (this.clazz.getName ());
			protocol.setMethodName (method.getName ());
			protocol.setParames (method.getParameterTypes ());
			protocol.setValues (args);

			RpcProxyHandler consumerHandler = new RpcProxyHandler ();
			NioEventLoopGroup workGroup = new NioEventLoopGroup ();
			try {

				Bootstrap client = new Bootstrap ();
				client.group (workGroup)
						.channel (NioSocketChannel.class)
						.option (ChannelOption.TCP_NODELAY, true)
						.handler (new ChannelInitializer<SocketChannel> () {
							@Override
							protected void initChannel(SocketChannel sc) throws Exception {
								ChannelPipeline pipeline = sc.pipeline ();

								//自定义协议解码器
								/** 入参有5个，分别解释如下
								 maxFrameLength：框架的最大长度。如果帧的长度大于此值，则将抛出TooLongFrameException。
								 lengthFieldOffset：长度字段的偏移量：即对应的长度字段在整个消息数据中得位置
								 lengthFieldLength：长度字段的长度：如：长度字段是int型表示，那么这个值就是4（long型就是8）
								 lengthAdjustment：要添加到长度字段值的补偿值
								 initialBytesToStrip：从解码帧中去除的第一个字节数
								 */
								pipeline.addLast ("frameDecoder", new LengthFieldBasedFrameDecoder (Integer.MAX_VALUE, 0, 4, 0, 4))
										.addLast ("frameEncoder", new LengthFieldPrepender (4))
										.addLast ("encoder", new ObjectEncoder ())
										.addLast ("decoder", new ObjectDecoder (Integer.MAX_VALUE, ClassResolvers.cacheDisabled (null)))
										.addLast ("handler", consumerHandler);
							}
						});
				try {
					ChannelFuture future = client.connect ("localhost", 8888).sync ();
					future.channel ().writeAndFlush (protocol).sync ();
					future.channel ().closeFuture ().sync ();
				} catch (InterruptedException e) {
					e.printStackTrace ();
				}
			} catch (Exception e) {
				e.printStackTrace ();
			}finally {
				workGroup.shutdownGracefully ();
			}
			return consumerHandler.getResponse ();
		}
	}
}
