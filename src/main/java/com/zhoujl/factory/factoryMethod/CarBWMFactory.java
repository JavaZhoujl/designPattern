package com.zhoujl.factory.factoryMethod;

import com.zhoujl.factory.CarBMW;
import com.zhoujl.factory.ICar;

public class CarBWMFactory implements ICarFactory {
    @Override
    public ICar create() {
        return new CarBMW();
    }
}
