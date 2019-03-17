package com.zhoujl.delegate;

public class EmployeeB implements IEmployee {
    @Override
    public void doing() {
        System.out.println("我是员工B，我擅长多线程。");
    }
}
