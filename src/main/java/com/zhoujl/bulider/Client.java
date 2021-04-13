package com.zhoujl.bulider;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 11:34
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        //1万辆A类型的奔驰车
        for(int i=0;i<10;i++){
            director.getABenzModel().run();
        }
        //100万辆B类型的奔驰车
        for(int i=0;i<5;i++){
            director.getBBenzModel().run();
        }
        //1000万辆C类型的宝马车
        for(int i=0;i<4;i++){
            director.getCBMWModel().setAlarmFlag(false);
            director.getCBMWModel().run();
        }
    }
}
