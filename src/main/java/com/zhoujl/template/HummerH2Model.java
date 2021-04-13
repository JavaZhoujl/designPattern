package com.zhoujl.template;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 10:12
 * @Version 1.0
 **/
public class HummerH2Model extends AbsHummerModel {

    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("启动H2悍马车！");
    }

    @Override
    protected void stop() {
        System.out.println("H2悍马车停车");
    }

    @Override
    protected void alarm() {
        System.out.println("H2悍马车--嘀嘀嘀");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2悍马车的引擎嗡嗡嗡");
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
}
