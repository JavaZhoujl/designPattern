package com.zhoujl.proxy.ordinary;

/**
 * @Description 调用者只知代理而不用知道真实 的角色是谁，
 * 屏蔽了真实角色的变更对高层模块的影响，真实的主题角色想怎么修改就怎么修改，
 * 对高层次的模块没有任何的影响，只要你实 现了接口所对应的方法，
 * 该模式非常适合对扩展性要求较高的场合。当 然，在实际的项目中，
 * 一般都是通过约定来禁止new一个真实的角色， 这也是一个非常好的方案。
 * @Author zjl
 * @Date 2020/10/15 23:16
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        GamePlayerProxy playerProxy = new GamePlayerProxy("uzi");
        playerProxy.login("张三", "666666");
        playerProxy.killBoss();
        playerProxy.upgrade();
    }
}
