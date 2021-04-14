package com.zhoujl.decorator;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 11:08
 * @Version 1.0
 **/
public class FourGradeSchoolReport implements SchoolReport {

    @Override
    public void report() {
        System.out.println("我的成绩只有40分！");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长请签字："+name);
    }
}
