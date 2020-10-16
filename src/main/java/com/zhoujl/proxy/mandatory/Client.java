package com.zhoujl.proxy.mandatory;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2020/10/15 23:35
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("张三");
//        GamePlayerProxy proxy = new GamePlayerProxy(gamePlayer);
        IGamePlayer proxy = gamePlayer.getProxy();
        proxy.login("张三", "666666");
        proxy.killBoss();
        proxy.upgrade();
    }
}
