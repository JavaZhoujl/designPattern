package com.zhoujl.visitor;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 15:07
 * @Version 1.0
 **/
public class Manager extends Employee {

    //这类人物的职责非常明确：业绩
    private String performance;
    public String getPerformance() {
        return performance;
    }
    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
