package com.zhoujl.bridge;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/16 11:27
 * @Version 1.0
 **/
public class SanzaiCorp extends Corp {

    protected SanzaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("公司靠卖山寨赚了不少钱！");
    }
}
