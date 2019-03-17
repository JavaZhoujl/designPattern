package com.zhoujl.factory.factoryMethod;

import com.zhoujl.factory.ICar;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICar car = new CarBWMFactory().create();
        car.carMaking();

        car = new CarFerrariFactory().create();
        car.carMaking();
    }
}
