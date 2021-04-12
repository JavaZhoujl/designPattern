package com.zhoujl.test;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.util.List;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/6 16:51
 * @Version 1.0
 **/
class Test {


    class GrandFather {
        void thinking() {
            System.out.println("i am grandFather");
        }
    }

    class Father extends GrandFather {

        @Override
        void thinking() {
            System.out.println("i am father");
        }
    }

    class Son extends Father {
        @Override
        void thinking() {
            try {
                MethodType mt = MethodType.methodType(void.class);

                Field impl_lookup = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");

                impl_lookup.setAccessible(true);

                MethodHandles.Lookup lookup = (MethodHandles.Lookup) impl_lookup.get(null);

                MethodHandle mh = lookup.findSpecial(GrandFather.class, "thinking", mt, getClass());

                mh.invoke(this);
            } catch (Throwable e) {
            }
        }
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        (new Test().new Son()).thinking();
    }
}
