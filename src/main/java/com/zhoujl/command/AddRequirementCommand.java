package com.zhoujl.command;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 17:13
 * @Version 1.0
 **/
public class AddRequirementCommand extends Command {

    @Override
    protected void execute() {
        this.requirementGroup.find();
        this.requirementGroup.add();
        this.requirementGroup.plan();
    }
}
