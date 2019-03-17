package com.zhoujl.factory.abstractFactory;

public interface CarFactory {
    IBicycle createBicycle();
    ISedan createSedan();
}
