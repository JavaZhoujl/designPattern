package com.zhoujl.decorator;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 11:17
 * @Version 1.0
 **/
public class Father {

    public static void main(String[] args) {
        SchoolReport sr = null;
        sr = new FourGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("张三");
    }
}
