package com.zhoujl.netty.rpc.consumer;

import com.ultrapower.show.netty.rpc.api.IRpcHelloService;
import com.ultrapower.show.netty.rpc.api.IRpcService;
import com.ultrapower.show.netty.rpc.consumer.proxy.RpcProxy;

/**
 * Description:
 *
 * @Date: 2019年06月17日 下午 16:28
 * @author: zhoujl
 * @Version: 1.0
 */
public class RpcConsumer {

	public static void main(String[] args) {
		IRpcHelloService rpcHelloService = RpcProxy.create(IRpcHelloService.class);
		System.out.println (rpcHelloService.sayHello ("Mr.s 周建磊"));

		IRpcService rpcService = RpcProxy.create (IRpcService.class);
		System.out.println (rpcService.add (6, 2));
		System.out.println (rpcService.sub (6, 2));
		System.out.println (rpcService.div (6, 2));
		System.out.println (rpcService.mult (6, 2));
	}
}
