package com.zhoujl.factory.factoryMethod;

import com.zhoujl.factory.CarFerrari;
import com.zhoujl.factory.ICar;

public class CarFerrariFactory implements ICarFactory {
    @Override
    public ICar create() {
        return new CarFerrari();
    }
}
