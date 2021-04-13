package com.zhoujl.command;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 17:11
 * @Version 1.0
 **/
public class DeletePageCommand extends Command {

    @Override
    protected void execute() {
        this.pageGroup.find();
        this.pageGroup.delete();
    }
}
