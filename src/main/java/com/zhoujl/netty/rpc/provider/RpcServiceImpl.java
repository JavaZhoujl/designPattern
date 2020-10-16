package com.zhoujl.netty.rpc.provider;

import com.zhoujl.netty.rpc.api.IRpcService;

/**
 * Description:
 *
 * @Date: 2019年06月17日 下午 15:05
 * @author: zhoujl
 * @Version: 1.0
 */
public class RpcServiceImpl implements IRpcService {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mult(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		return a/b;
	}
}
