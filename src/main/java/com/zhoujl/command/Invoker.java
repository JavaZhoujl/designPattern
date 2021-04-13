package com.zhoujl.command;

/**
 * @Description 负责人
 * @Author zjl
 * @Date 2021/4/13 17:16
 * @Version 1.0
 **/
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
