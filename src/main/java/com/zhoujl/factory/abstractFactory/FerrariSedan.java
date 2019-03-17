package com.zhoujl.factory.abstractFactory;

public class FerrariSedan implements ISedan {
    @Override
    public void run() {
        System.out.println("我是法拉利轿车！");
    }
}
