package com.zhoujl.bulider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 模板方法模式定义的汽车模板
 * @Author zjl
 * @Date 2021/4/13 10:56
 * @Version 1.0
 **/
public abstract class AbsCarModel {

    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for(String actionName: sequence){
            if(actionName.equalsIgnoreCase("start")) {
                this.start();
            }else if(actionName.equalsIgnoreCase("stop")) {
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")) {
                if(isAlarm()) {
                    alarm();
                }
            }else if(actionName.equalsIgnoreCase("engineBoom")) {
                this.engineBoom();
            }
        }
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

    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
