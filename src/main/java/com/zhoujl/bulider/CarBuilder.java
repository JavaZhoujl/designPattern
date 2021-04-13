package com.zhoujl.bulider;

import java.util.List;

public interface CarBuilder {

    void setSequence(List<String> sequence);

    AbsCarModel getCarModel();
}
