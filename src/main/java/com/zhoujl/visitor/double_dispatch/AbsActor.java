package com.zhoujl.visitor.double_dispatch;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/10/16 10:38
 * @Version 1.0
 **/
public abstract class AbsActor {

    public void act(IRole role) {
        System.out.println("我可以扮演任何角色！");
    }

    public void act(KongFuIRole kongFuIRole) {
        System.out.println("演员可以演功夫角色！");
    }
}
