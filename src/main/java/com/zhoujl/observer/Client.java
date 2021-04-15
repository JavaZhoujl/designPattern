package com.zhoujl.observer;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 9:31
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ConcreteObserver observer = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(observer);
        subject.notifyObservers();
    }
}
