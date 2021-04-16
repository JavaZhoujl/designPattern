package com.zhoujl.bridge;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/16 11:22
 * @Version 1.0
 **/
public class HouseProduct extends Product {

    @Override
    protected void beProducted() {
        System.out.println("公司生产大房子");
    }

    @Override
    protected void beSell() {
        System.out.println("公司出售大房子");
    }
}
