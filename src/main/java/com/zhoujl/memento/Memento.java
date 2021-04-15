package com.zhoujl.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 11:08
 * @Version 1.0
 **/
public class Memento {

    private Map<String, Object> stateMap = new HashMap<>();

    public Memento(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

}
