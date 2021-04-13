package com.zhoujl.template;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 10:19
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        HummerH1Model h1Model = new HummerH1Model();
        h1Model.run();

        HummerH2Model h2Model = new HummerH2Model();
        h2Model.setAlarmFlag(false);
        h2Model.run();

    }
}
