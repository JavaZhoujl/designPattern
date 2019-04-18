package com.zhoujl.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * @Author zhoujl
 * @Date 2019/4/18 21:40
 * @Version 1.0
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
