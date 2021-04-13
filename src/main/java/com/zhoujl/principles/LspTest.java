package com.zhoujl.principles;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 里氏替换原则测试类
 * @Author zjl
 * @Date 2021/4/12 11:37
 * @Version 1.0
 **/
public class LspTest {

    public static class Father {
        public Collection doSomething(Map map){
            System.out.println("父类被执行...");
            return map.values();
        }

    }

    public static class Son extends Father {

        /**
         * 子类中方法的前置条件必须与超类中被覆写的方法的前置条件相同或者更宽松。
         * @param map
         * @return {@link Collection}
         * @date 2021/4/12 11:46
         */
        @Override
        public Collection doSomething(Map map){
            System.out.println("子类被执行...");
            return map.values();
        }

    }

    public static void invoker(){
        //有父类的地方就有子类
        Father f= new Father();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void invoker2(){
        //有父类的地方就有子类
        Son f =new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {
        invoker();
        invoker2();
    }
}
