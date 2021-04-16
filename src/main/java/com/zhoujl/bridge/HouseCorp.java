package com.zhoujl.bridge;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/16 11:25
 * @Version 1.0
 **/
public class HouseCorp extends Corp {

    protected HouseCorp(HouseProduct houseProduct) {
        super(houseProduct);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("公司靠卖房子挣了打钱！");
    }
}
