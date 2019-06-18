package com.zhoujl.netty.rpc.registry;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

/**
 * Description:
 *
 * @Date: 2019年06月17日 下午 15:13
 * @author: zhoujl
 * @Version: 1.0
 */
public class RpcRegistry {

	private int port;

	public RpcRegistry(int port) {
		this.port = port;
	}

	public void start() {
		//netty服务端新建boss线程组和工作线程组
		NioEventLoopGroup bossGroup = new NioEventLoopGroup ();
		NioEventLoopGroup workGroup = new NioEventLoopGroup ();
		try{
			//服务端创建类
			ServerBootstrap server = new ServerBootstrap ();
			server.group (bossGroup, workGroup)
					.channel (NioServerSocketChannel.class)
					.childHandler (new ChannelInitializer<SocketChannel> () {
						@Override
						protected void initChannel(SocketChannel sc) throws Exception {
							ChannelPipeline pipeline = sc.pipeline ();

							//自定义协议解码器
							/** 入参有5个，分别解释如下
							 maxFrameLength：框架的最大长度。如果帧的长度大于此值，则将抛出TooLongFrameException。
							 lengthFieldOffset：长度字段的偏移量：即对应的长度字段在整个消息数据中得位置
							 lengthFieldLength：长度字段的长度。如：长度字段是int型表示，那么这个值就是4（long型就是8）
							 lengthAdjustment：要添加到长度字段值的补偿值
							 initialBytesToStrip：从解码帧中去除的第一个字节数
							 */
							pipeline.addLast (new LengthFieldBasedFrameDecoder (Integer.MAX_VALUE, 0, 4, 0,4))
									.addLast (new LengthFieldPrepender (4))
									.addLast ("encoder", new ObjectEncoder ())
									.addLast ("decoder", new ObjectDecoder (Integer.MAX_VALUE, ClassResolvers.cacheDisabled (null)))
									.addLast (new RpcRegistryHandler());
						}
					})
					.option (ChannelOption.SO_BACKLOG, 128)
					.childOption (ChannelOption.SO_KEEPALIVE,true);
			try {
				ChannelFuture future = server.bind (port).sync ();
				System.out.println("GP RPC Registry start listen at " + port );
				future.channel ().closeFuture ().sync ();
			} catch (InterruptedException e) {
				e.printStackTrace ();
			}
		}catch (Exception e) {
			bossGroup.shutdownGracefully ();
			workGroup.shutdownGracefully ();
			e.printStackTrace ();
		}
	}

	public static void main(String[] args) {
		new RpcRegistry (8888).start ();
	}
}
