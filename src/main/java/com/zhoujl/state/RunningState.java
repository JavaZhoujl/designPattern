package com.zhoujl.state;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 15:57
 * @Version 1.0
 **/
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下运行...");

    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        //环境设置为停止状态
        super.context.getLiftState().stop();
    }
}
