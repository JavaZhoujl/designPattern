package com.zhoujl.singleton.test;

import com.zhoujl.singleton.StaticInnerClassSingletonPattern;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author zhoujl
 * @Date 2019/4/15 22:09
 * @Version 1.0
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        /*Class clazz = StaticInnerClassSingletonPattern.class;
        try {
            StaticInnerClassSingletonPattern singletonPattern = (StaticInnerClassSingletonPattern)clazz.newInstance();
            Class[] innerClazz = clazz.getDeclaredClasses();
            for (Class cls: innerClazz) {
                int mod = cls.getModifiers();
                String modifier = Modifier.toString(mod);
                if(modifier.contains("static")) {
                    Object o = cls.newInstance();
                    Field fields  = cls.getDeclaredField("f");
                    fields.setAccessible(true);
                    System.out.println(fields.get(o));
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        Field[] fields = clazz.getDeclaredFields();*/
        System.out.println("End");

    }
}
