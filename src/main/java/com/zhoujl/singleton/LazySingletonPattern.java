package com.zhoujl.singleton;

public class LazySingletonPattern {
    private static volatile LazySingletonPattern lazySingletonPattern =null;

    private LazySingletonPattern () {}

    /*public static LazySingletonPattern getInstance() {
        if(lazySingletonPattern == null) {
            lazySingletonPattern = new LazySingletonPattern();
        }
        return lazySingletonPattern;
    }*/

    public static LazySingletonPattern getInstance() {
        if(lazySingletonPattern == null) {
            synchronized (LazySingletonPattern.class) {
                // 双重检查锁
                if(lazySingletonPattern == null) {
                    lazySingletonPattern = new LazySingletonPattern();
                }

            }
        }
        return lazySingletonPattern;
    }
}
