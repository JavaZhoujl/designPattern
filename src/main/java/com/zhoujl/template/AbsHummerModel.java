package com.zhoujl.template;

/**
 * @Description 悍马抽象模板
 * @Author zjl
 * @Date 2021/4/13 10:07
 * @Version 1.0
 **/
public abstract class AbsHummerModel {

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    final public void run() {
        start();
        engineBoom();
        if(isAlarm()) {
            alarm();
        }
        stop();
    }

    /**
     * 钩子方法，默认喇叭是会响的
     * @param
     * @return {@link boolean}
     * @date 2021/4/13 10:16
     */
    protected boolean isAlarm() {
        return true;
    }

}
