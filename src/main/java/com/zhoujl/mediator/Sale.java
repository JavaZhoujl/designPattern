package com.zhoujl.mediator;

import java.util.Random;

/**
 * @Description 销售类
 * @Author zjl
 * @Date 2020/11/4 23:28
 * @Version 1.0
 **/
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    //销售IBM电脑
    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑"+number+"台");
    }
    //反馈销售情况，0～100变化，0代表根本就没人买，100代表非常畅销，出一个 卖一个
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }

    //折价处理
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
