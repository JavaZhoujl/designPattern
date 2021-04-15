package com.zhoujl.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 11:09
 * @Version 1.0
 **/
public class Caretaker {

    private Map<String, Memento> memento = new HashMap<>();

    public Memento getMemento(String key) {
        return memento.get(key);
    }

    public void setMemento(String key, Memento value) {
        this.memento.put(key, value);
    }
}
