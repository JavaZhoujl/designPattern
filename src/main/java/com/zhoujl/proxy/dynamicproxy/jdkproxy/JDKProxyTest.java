package com.zhoujl.proxy.dynamicproxy.jdkproxy;

import com.zhoujl.proxy.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author zhoujl
 * @Date 2019/4/18 21:45
 * @Version 1.0
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        Object obj = new JDKMeipo().getInstance(new Girl());
//        Person obj = new JDKMeipo().getInstance(new Girl());
        try {
            Method method = obj.getClass().getMethod("findLove", null);
            method.invoke(obj);
//            obj.findLove();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
