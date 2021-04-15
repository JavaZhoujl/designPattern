package com.zhoujl.observer;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 9:28
 * @Version 1.0
 **/
public class ConcreteSubject extends Subject {

    public void doSomething() {
        super.notifyObservers();
    }
}
