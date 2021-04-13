package com.zhoujl.command;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 17:17
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AddRequirementCommand command = new AddRequirementCommand();
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
