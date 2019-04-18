package com.zhoujl.proxy.dynamicproxy.jdkproxy;

import com.zhoujl.proxy.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高178cm");
        System.out.println("有一块腹肌");
    }
}
