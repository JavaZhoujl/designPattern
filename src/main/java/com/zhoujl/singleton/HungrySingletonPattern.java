package com.zhoujl.singleton;

/**
 *
 */
public class HungrySingletonPattern {

//    private static final HungrySingletonPattern hungrySingletonPattern = new HungrySingletonPattern();

    private static final HungrySingletonPattern hungrySingletonPattern;
    static {
        hungrySingletonPattern = new HungrySingletonPattern();
    }

    private HungrySingletonPattern(){}

    public static HungrySingletonPattern getInstance() {
        return hungrySingletonPattern;
    }
}
