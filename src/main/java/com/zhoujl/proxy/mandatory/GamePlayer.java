package com.zhoujl.proxy.mandatory;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/10/15 23:24
 * @Version 1.0
 **/
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String userName, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + userName + "的用 户" + this.name + "登录成功！");
        } else {
            System.out.println("请使用指定的代理访问");
            ;
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 又升了一级！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
