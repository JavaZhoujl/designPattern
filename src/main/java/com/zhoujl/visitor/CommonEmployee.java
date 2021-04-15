package com.zhoujl.visitor;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 15:07
 * @Version 1.0
 **/
public class CommonEmployee extends Employee {

    //工作内容，这非常重要，以后的职业规划就是靠它了
    private String job;
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
