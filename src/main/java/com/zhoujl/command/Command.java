package com.zhoujl.command;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 17:09
 * @Version 1.0
 **/
public abstract class Command {

    protected CodeGroup codeGroup = new CodeGroup();

    protected PageGroup pageGroup = new PageGroup();

    protected RequirementGroup requirementGroup = new RequirementGroup();

    protected abstract void execute();
}
