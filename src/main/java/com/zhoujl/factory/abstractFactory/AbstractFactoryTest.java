package com.zhoujl.factory.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        FerraroiCarFactory ferraroiCarFactory = new FerraroiCarFactory();
        ferraroiCarFactory.createBicycle().run();
        ferraroiCarFactory.createSedan().run();
    }
}
