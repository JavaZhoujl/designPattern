package com.zhoujl.netty.rpc.provider;

import com.ultrapower.show.netty.rpc.api.IRpcHelloService;

/**
 * Description:
 *
 * @Date: 2019年06月17日 下午 15:05
 * @author: zhoujl
 * @Version: 1.0
 */
public class RpcHelloServiceImpl implements IRpcHelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}
}
