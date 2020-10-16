package com.zhoujl.proxy.ordinary;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/10/15 23:05
 * @Version 1.0
 **/
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(String name) {
        try {
            this.gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
