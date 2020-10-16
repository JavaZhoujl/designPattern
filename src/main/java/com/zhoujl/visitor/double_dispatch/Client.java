package com.zhoujl.visitor.double_dispatch;

/**
 * @Description 双分派意味着得到执行的操作决定于请求的种 类和两个接收者的类型，
 * 它是多分派的一个特例。从这里也可以看到 Java是一个支持双分派的单分派语言。
 *
 * @Author zjl
 * @Date 2020/10/16 10:45
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        /**静态绑定，即编译时绑定，其作用是，保证方法调用、变量访问的正确性以及加快代码的运行速度。
         * 注意，所有方法调用、变量访问在编译时都会绑定到一个具体的对象上，
         * 但部分重写的方法在调用时会涉及到动态绑定。
         *
         * 成员变量只会根据变量的声明类型进行静态绑定，相似的还有，
         * private修饰的方法、static修饰的方法以及final修改的方法，
         * 这几种方法都有一个共同特点，无法进行重写。
         * */
        OldActor actor = new OldActor();
        // 申明类型为IRole
        IRole role = new KongFuIRole();
        // 重载在编译器就决定用那个方法，他是根据IRole申明类型决定调用act(IRole role)方法，这是静态绑定
        actor.act(role);

        /**动态绑定，即运行时绑定，相比静态绑定，动态绑定会降低代码的运行效率，但能为编程带来更强的灵活性，
         * Java中的多态即利用动态绑定实现的特性。
         *
         * 动态绑定只会出现在方法重写的场景中
         * */
        // 而actor的执行方法act 则是由其实际类型决定的，这是动态绑定。
        actor.act(new KongFuIRole());

    }
}
