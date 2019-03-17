package com.zhoujl.proxy.dynamicproxy.jdkproxy;

import com.zhoujl.proxy.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("找对象");
    }
}
