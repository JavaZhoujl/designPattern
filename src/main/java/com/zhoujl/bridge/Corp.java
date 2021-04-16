package com.zhoujl.bridge;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/16 11:20
 * @Version 1.0
 **/
public abstract class Corp {

    private Product product;

    protected Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSell();
    }

}
