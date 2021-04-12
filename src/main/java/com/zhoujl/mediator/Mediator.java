package com.zhoujl.mediator;

/**
 * @Description 具体中介者
 * @Author zjl
 * @Date 2020/11/4 23:31
 * @Version 1.0
 **/
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            //采购电脑
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            //销售电脑
            this.sellComputer((Integer) objects[0]);
            //折价销售
        } else if (str.equals("sale.offsell")) {
            this.offSell();
            //清仓处理
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void clearStock() {
        //要求清仓销售
        super.sale.offSale();
        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }

    private void offSell() {
        System.out.println("折价销售IBM电 脑" + stock.getStockNumber() + "台");
    }

    private void sellComputer(Integer number) {
        if (super.stock.getStockNumber() < number) {
            //库存数量 不够销售
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void buyComputer(Integer number) {
        int saleStatus = super.sale.getSaleStatus();
        //销售情况良好
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑:" + number + "台");
            super.stock.increase(number);
        } else {  //销售情况不好
            //折半采购
            int buyNumber = number / 2;
            System.out.println("采购IBM电 脑：" + buyNumber + "台");
        }
    }
}
