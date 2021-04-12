package com.zhoujl.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/11/3 23:22
 * @Version 1.0
 **/
public class Thing implements Cloneable {

    private ArrayList<String> arrList = new ArrayList<>();

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            thing.arrList = (ArrayList<String>) this.arrList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }


    public void setValue(String value) {
        this.arrList.add(value);
    }

    public List<String> getValue() {
        return this.arrList;
    }
}
