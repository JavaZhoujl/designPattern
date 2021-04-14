package com.zhoujl.decorator;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 11:13
 * @Version 1.0
 **/
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport report) {
        super(report);
    }

    private void highScore() {
        System.out.println("班级最高分只有50分！");
    }

    @Override
    public void report() {
        this.highScore();
        super.report();
    }
}
