package com.zhoujl.bulider;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 11:06
 * @Version 1.0
 **/
public class BMWModel extends AbsCarModel {
    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("宝马车启动！");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车！");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车鸣笛：嘀嘀嘀嘀");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎 ang ang ang");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
