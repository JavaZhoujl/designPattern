package com.zhoujl.netty.rpc.protocol;

import java.io.Serializable;

/**
 * Description:
 *
 * @Date: 2019年06月17日 下午 14:59
 * @author: zhoujl
 * @Version: 1.0
 */
public class InvokerProtocol implements Serializable {

	//类名
	private String className;
	//函数名称
	private String methodName;
	//形参
	private Class<?>[] parames;
	//实参
	private Object[] values;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Class<?>[] getParames() {
		return parames;
	}

	public void setParames(Class<?>[] parames) {
		this.parames = parames;
	}

	public Object[] getValues() {
		return values;
	}

	public void setValues(Object[] values) {
		this.values = values;
	}
}
