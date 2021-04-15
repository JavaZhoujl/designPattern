package com.zhoujl.observer;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 9:30
 * @Version 1.0
 **/
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收到消息, 并进行处理！");
    }
}
