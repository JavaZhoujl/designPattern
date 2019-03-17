package com.zhoujl.factory.simpleFactory;

import com.zhoujl.factory.CarBMW;
import com.zhoujl.factory.ICar;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        ICar car = carFactory.create(CarBMW.class);
        car.carMaking();
    }
}
