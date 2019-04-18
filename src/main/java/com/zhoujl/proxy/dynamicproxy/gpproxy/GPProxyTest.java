package com.zhoujl.proxy.dynamicproxy.gpproxy;

import com.zhoujl.proxy.Person;
import com.zhoujl.proxy.dynamicproxy.jdkproxy.Girl;

/**
 * @Author zhoujl
 * @Date 2019/4/18 21:40
 * @Version 1.0
 */
public class GPProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new GPMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
