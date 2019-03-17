package com.zhoujl.factory.abstractFactory;

public class FerrariBicycle implements IBicycle {
    @Override
    public void run() {
        System.out.println("我是法拉利自行车！");
    }
}
