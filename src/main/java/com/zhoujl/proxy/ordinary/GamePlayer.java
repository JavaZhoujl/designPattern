package com.zhoujl.proxy.ordinary;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/10/15 23:02
 * @Version 1.0
 **/
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if(gamePlayer == null) {
            throw new Exception("不能创建真实角色");
        }
        this.name = name;
    }

    @Override
    public void login(String userName, String password) {
        System.out.println("登录名为"+userName + "的用户" + this.name + "登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！");
    }
}
