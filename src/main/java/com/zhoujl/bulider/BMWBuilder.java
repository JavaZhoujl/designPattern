package com.zhoujl.bulider;

import java.util.List;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 11:17
 * @Version 1.0
 **/
public class BMWBuilder implements CarBuilder {

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public AbsCarModel getCarModel() {
        return this.bmwModel;
    }
}
