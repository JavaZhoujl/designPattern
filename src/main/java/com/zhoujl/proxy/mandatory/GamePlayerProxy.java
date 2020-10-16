package com.zhoujl.proxy.mandatory;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/10/15 23:26
 * @Version 1.0
 **/
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String userName, String password) {
        gamePlayer.login(userName, password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
