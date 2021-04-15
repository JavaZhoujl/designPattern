package com.zhoujl.visitor;

/**
 * 访问者
 * @date 2021/4/15 15:03
 */
public interface IVisitor {

    void visit(CommonEmployee employee);
    void visit(Manager employee);
}
