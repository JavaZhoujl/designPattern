package com.zhoujl.singleton.test;

import com.zhoujl.singleton.LazySingletonPattern;
import com.zhoujl.singleton.StaticInnerClassSingletonPattern;

/**
 * @Author zhoujl
 * @Date 2019/4/15 22:06
 * @Version 1.0
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        //LazySingletonPattern singletonPattern = LazySingletonPattern.getInstance(); 懒汉式单例测试
        StaticInnerClassSingletonPattern singletonPattern = StaticInnerClassSingletonPattern.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singletonPattern);
    }
}
