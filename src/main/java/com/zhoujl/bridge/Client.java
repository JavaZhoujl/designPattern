package com.zhoujl.bridge;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/16 11:28
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        HouseCorp houseCorp = new HouseCorp(new HouseProduct());
        houseCorp.makeMoney();

        SanzaiCorp sanzaiCorp = new SanzaiCorp(new IPadProduct());
        sanzaiCorp.makeMoney();
    }
}
