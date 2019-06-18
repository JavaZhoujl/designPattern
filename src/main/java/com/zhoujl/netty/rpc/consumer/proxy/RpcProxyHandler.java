package com.zhoujl.netty.rpc.consumer.proxy;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Description:
 *
 * @Date: 2019年06月17日 下午 17:05
 * @author: zhoujl
 * @Version: 1.0
 */
public class RpcProxyHandler extends ChannelInboundHandlerAdapter{

	private Object response;

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		response = msg;
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		System.out.println("client exception is general");
	}

	public Object getResponse() {
		return response;
	}
}
