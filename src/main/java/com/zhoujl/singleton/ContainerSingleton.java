package com.zhoujl.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author zhoujl
 * @Date 2019/4/17 16:34
 * @Version 1.0 注册式单例
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object geInstance(String className) {
        synchronized (ioc) {
            if(!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);

                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return obj;
            }else {
                return ioc.get(className);
            }
        }
    }
}
