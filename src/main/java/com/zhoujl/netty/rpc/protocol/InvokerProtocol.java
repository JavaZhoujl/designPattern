package com.zhoujl.netty.rpc.protocol;

import lombok.Data;

import java.io.Serializable;

/**
 * Description:
 *
 * @Date: 2019年06月17日 下午 14:59
 * @author: zhoujl
 * @Version: 1.0
 */
@Data
public class InvokerProtocol implements Serializable {

	//类名
	private String className;
	//函数名称
	private String methodName;
	//形参
	private Class<?>[] parames;
	//实参
	private Object[] values;
}
