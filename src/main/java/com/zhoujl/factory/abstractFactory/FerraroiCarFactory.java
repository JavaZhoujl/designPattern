package com.zhoujl.factory.abstractFactory;

public class FerraroiCarFactory implements CarFactory {
    @Override
    public IBicycle createBicycle() {
        return new FerrariBicycle();
    }

    @Override
    public ISedan createSedan() {
        return new FerrariSedan();
    }
}
