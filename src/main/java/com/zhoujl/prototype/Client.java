package com.zhoujl.prototype;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/11/3 23:26
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Thing thing = new Thing();
        Thing clone = thing.clone();
        thing.setValue("张三");
        clone.setValue("李四");
        System.out.println(thing.getValue());
        System.out.println(clone.getValue());
        System.out.println(thing == clone);
        System.out.println(thing.getValue() == clone.getValue());
    }
}
