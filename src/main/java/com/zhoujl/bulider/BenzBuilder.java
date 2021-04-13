package com.zhoujl.bulider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/13 11:15
 * @Version 1.0
 **/
public class BenzBuilder implements CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public AbsCarModel getCarModel() {
        return this.benzModel;
    }
}
