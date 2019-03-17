package com.zhoujl.delegate;

public class EmployeeA implements IEmployee {
    @Override
    public void doing() {
        System.out.println("我是员工A，我擅长数据库。");
    }
}
