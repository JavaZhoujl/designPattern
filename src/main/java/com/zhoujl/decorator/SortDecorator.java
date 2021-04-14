package com.zhoujl.decorator;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 11:15
 * @Version 1.0
 **/
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport report) {
        super(report);
    }

    private void sort() {
        System.out.println("我在班上排名15名！");
    }

    @Override
    public void report() {
        super.report();
        this.sort();
    }
}
