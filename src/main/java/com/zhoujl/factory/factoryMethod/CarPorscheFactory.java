package com.zhoujl.factory.factoryMethod;

import com.zhoujl.factory.CarPorsche;
import com.zhoujl.factory.ICar;

public class CarPorscheFactory implements ICarFactory {
    @Override
    public ICar create() {
        return new CarPorsche();
    }
}
