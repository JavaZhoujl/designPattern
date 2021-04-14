package com.zhoujl.decorator;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 11:10
 * @Version 1.0
 **/
public abstract class Decorator implements SchoolReport {

    private SchoolReport report;

    public Decorator(SchoolReport report) {
        this.report = report;
    }

    @Override
    public void report() {
        report.report();
    }

    @Override
    public void sign(String name) {
        report.sign(name);
    }
}
