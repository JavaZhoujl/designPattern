package com.zhoujl.strategy.pay;

public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东";
    }

    @Override
    public double queryBalance(String uid) {
        return 4500;
    }
}
