package com.zhoujl.bridge;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/16 11:23
 * @Version 1.0
 **/
public class IPadProduct extends Product {
    @Override
    protected void beProducted() {
        System.out.println("公司生产平板电脑！");
    }

    @Override
    protected void beSell() {
        System.out.println("公司销售平板电脑");
    }
}
