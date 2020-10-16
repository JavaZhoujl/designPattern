package com.zhoujl.visitor.double_dispatch;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/10/16 10:42
 * @Version 1.0
 **/
public class OldActor extends AbsActor {

    @Override
    public void act(KongFuIRole kongFuIRole) {

        System.out.println("不能演功夫演员，容易闪到腰。");
    }
}
