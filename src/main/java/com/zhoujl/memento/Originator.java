package com.zhoujl.memento;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/15 11:07
 * @Version 1.0
 **/
public class Originator {

    private String state1;
    private String state2;
    private String state3;

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    /**
     * 创建一个备忘录
     * @param
     * @return {@link Memento}
     * @date 2021/4/15 11:22
     */
    public Memento createMemento() {
        return new Memento(BeanUtils.backupProp(this));
    }

    /**
     * 恢复一个备忘录
     * @param memento
     * @date 2021/4/15 11:29
     */
    public void restoreMemento(Memento memento) {
        BeanUtils.restoreProp(this, memento.getStateMap());
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state1='" + state1 + '\'' +
                ", state2='" + state2 + '\'' +
                ", state3='" + state3 + '\'' +
                '}';
    }
}
