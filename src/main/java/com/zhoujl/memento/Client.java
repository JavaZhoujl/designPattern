package com.zhoujl.memento;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 11:29
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Originator ori = new Originator();
        Caretaker caretaker = new Caretaker();

        ori.setState1("中国");
        ori.setState2("强盛");
        ori.setState3("繁荣");
        System.out.println("===初始化状态===\n"+ori);
        //创建一个备忘录
        caretaker.setMemento("001", ori.createMemento());
        //修改状态值
        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");
        System.out.println("\n===修改后状态===\n"+ori);
        caretaker.setMemento("002", ori.createMemento());

        ori.setState1("美女");
        ori.setState2("大妹子");
        ori.setState3("漂亮");
        System.out.println("\n===修改后状态===\n"+ori);
        //恢复一个备忘录
        ori.restoreMemento(caretaker.getMemento("002"));
        System.out.println("\n===恢复后状态===\n"+ori);
    }
}
