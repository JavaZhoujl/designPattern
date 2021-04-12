package com.zhoujl.mediator;

/**
 * @Description 抽象中介者
 * @Author zjl
 * @Date 2020/11/4 23:25
 * @Version 1.0
 **/
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    /**
     * 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
     * @param args
     * @param objects
     * @date 2020/11/4 23:31
     */
    public abstract void execute(String args, Object...objects);
}
