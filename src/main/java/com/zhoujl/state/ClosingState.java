package com.zhoujl.state;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 15:57
 * @Version 1.0
 **/
public class ClosingState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        // 设置为运行状态
        super.context.getLiftState().run();

    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        // 设置为停止状态
        super.context.getLiftState().stop();

    }
}
