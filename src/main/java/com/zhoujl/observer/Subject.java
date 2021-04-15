package com.zhoujl.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 抽象被观察者
 * @Author zjl
 * @Date 2021/4/15 9:23
 * @Version 1.0
 **/
public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    //删除一个观察者
    public void delObserver(Observer o){
        this.observerList.remove(o);
    }

    //通知所有观察者
    public void notifyObservers(){
        for(Observer o:this.observerList){
            o.update();
        }
    }

}
