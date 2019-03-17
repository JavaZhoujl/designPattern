package com.zhoujl.factory.simpleFactory;

import com.zhoujl.factory.ICar;

public class CarFactory {

    public ICar create (Class<? extends ICar> clazz) {
        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
