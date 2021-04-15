package com.zhoujl.state;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 15:51
 * @Version 1.0
 **/
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //首先电梯门开启动作
    public abstract void open();
    //电梯门有开启，那当然也就有关闭了
    public abstract void close();
    //电梯要能上能下，运行起来
    public abstract void run();
    //电梯还要能停下来
    public abstract void stop();
}
