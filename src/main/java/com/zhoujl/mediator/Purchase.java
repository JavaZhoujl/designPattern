package com.zhoujl.mediator;

/**
 * @Description 采购类
 * @Author zjl
 * @Date 2020/11/4 23:27
 * @Version 1.0
 **/
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy", number);
    }

    //不再采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
