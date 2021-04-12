package com.zhoujl.mediator;

/**
 * @Description 抽象同事类
 * @Author zjl
 * @Date 2020/11/4 23:23
 * @Version 1.0
 **/
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }

}
