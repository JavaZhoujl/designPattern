package com.zhoujl.singleton;

/**
 * @Author zhoujl
 * @Date 2019/4/15 21:43
 * @Version 1.0
 */
public class StaticInnerClassSingletonPattern {


    private StaticInnerClassSingletonPattern () {}

    public static StaticInnerClassSingletonPattern getInstance() {
        return InnerClazz.LAZY;

    }

    static class InnerClazz{
        private static final StaticInnerClassSingletonPattern LAZY = new StaticInnerClassSingletonPattern();
    }
}
