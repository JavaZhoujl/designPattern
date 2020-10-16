package com.zhoujl.proxy.mandatory;

public interface IGamePlayer {

    void login(String userName, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
