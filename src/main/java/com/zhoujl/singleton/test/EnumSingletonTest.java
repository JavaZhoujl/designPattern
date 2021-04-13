package com.zhoujl.singleton.test;

import com.zhoujl.singleton.EnumSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.text.NumberFormat;

/**
 * @Author zhoujl
 * @Date 2019/4/17 17:31
 * @Version 1.0
 */
public class EnumSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumSingleton enumSingleton = null;
        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        enumSingleton1.setData(new Object());

        FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(enumSingleton1);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("EnumSingleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        enumSingleton = (EnumSingleton)ois.readObject();
        ois.close();

        System.out.println(enumSingleton.getData());
        System.out.println(enumSingleton1.getData());
        System.out.println(enumSingleton.getData() == enumSingleton1.getData());

    }

//    public static void main(String[] args) {
//        try {
//            NumberFormat formatter = NumberFormat.getCurrencyInstance();
//            formatter.setMaximumFractionDigits(2);
//            System.out.println(formatter.format(366.66/100));
//            Class clazz = EnumSingleton.class;
//            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
//            c.setAccessible(true);
//            EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("Tom",666);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
