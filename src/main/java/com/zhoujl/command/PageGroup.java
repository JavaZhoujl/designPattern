package com.zhoujl.command;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 17:04
 * @Version 1.0
 **/
public class PageGroup implements Group {
    @Override
    public void add() {
        System.out.println("客户要求增加一项功能...");

    }

    @Override
    public void find() {
        System.out.println("找到页面组...");

    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能...");

    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项功能...");

    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划...");

    }
}
