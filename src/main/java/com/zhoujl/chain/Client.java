package com.zhoujl.chain;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 10:32
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        SonHandler sonHandler = new SonHandler();
        sonHandler.setType(3);
        FatherHandler fatherHandler = new FatherHandler();
        HusbandHandler husbandHandler = new HusbandHandler();
        husbandHandler.setType(2);
        fatherHandler.setNextHandler(husbandHandler);

        fatherHandler.setType(1);
        husbandHandler.setNextHandler(sonHandler);

        Women women = new Women(3, "我要去买菜！");
        fatherHandler.handlerMessage(women);
    }
}
