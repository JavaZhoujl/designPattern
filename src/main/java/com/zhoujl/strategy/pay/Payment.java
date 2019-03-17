package com.zhoujl.strategy.pay;

public abstract class Payment {

    //支付类型
    public abstract String getName();

    //查询余额
    public abstract double queryBalance(String uid);

    //扣款支付
    public MsgResult pay(String uid, double amount) {
        if(queryBalance(uid) < amount) {
            return new MsgResult(500, "支付宝", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额：" + amount);
    }
}
