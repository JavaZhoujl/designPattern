package com.zhoujl.singleton.test;

import com.zhoujl.singleton.ConcurrentExecutor;
import com.zhoujl.singleton.ContainerSingleton;

/**
 * @Author zhoujl
 * @Date 2019/4/17 17:09
 * @Version 1.0
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {

        try {
            long star = System.currentTimeMillis();
            ConcurrentExecutor.execute(() -> {
                Object obj = ContainerSingleton.geInstance("com.zhoujl.singleton.test.Pojo");
                System.out.println(System.currentTimeMillis()+ ":"+ obj);
            }, 60, 6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - star));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
