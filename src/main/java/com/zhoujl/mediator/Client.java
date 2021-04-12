package com.zhoujl.mediator;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/11/16 23:18
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        // 销售人员销售电脑
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(100);

        //库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
