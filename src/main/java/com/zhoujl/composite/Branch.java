package com.zhoujl.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 16:47
 * @Version 1.0
 **/
public class Branch extends Corp {

    //领导下边有哪些下级领导和小兵
    List<Corp> subordinateList = new ArrayList<Corp>();

    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public List<Corp> getSubordinateList() {
        return this.subordinateList;
    }
}
