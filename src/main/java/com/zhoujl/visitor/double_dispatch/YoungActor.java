package com.zhoujl.visitor.double_dispatch;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/10/16 10:44
 * @Version 1.0
 **/
public class YoungActor extends AbsActor {

    @Override
    public void act(KongFuIRole kongFuIRole) {
        System.out.println("哥们身体好，可以演大侠");
    }
}
