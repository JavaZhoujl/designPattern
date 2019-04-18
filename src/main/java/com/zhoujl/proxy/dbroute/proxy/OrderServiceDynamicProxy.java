package com.zhoujl.proxy.dbroute.proxy;

import com.zhoujl.proxy.dbroute.db.DynamicDataSourceEntity;
import com.zhoujl.proxy.dynamicproxy.gpproxy.GPClassLoader;
import com.zhoujl.proxy.dynamicproxy.gpproxy.GPInvocationHandler;
import com.zhoujl.proxy.dynamicproxy.gpproxy.GPProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author zhoujl
 * @Date 2019/4/18 22:06
 * @Version 1.0
 */
public class OrderServiceDynamicProxy implements GPInvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    Object proxyObj;
    public Object getInstance(Object proxyObj) {
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(proxyObj,args);
        after();
        return object;
    }

    private void after() {
        System.out.println("Proxy after method");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    //target 应该是订单对象Order
    private void before(Object target) {
        try {
            //进行数据源的切换
            System.out.println("Proxy before method");

            //约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
