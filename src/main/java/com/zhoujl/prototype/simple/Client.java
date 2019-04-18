package com.zhoujl.prototype.simple;

/**
 * @Author zhoujl
 * @Date 2019/4/18 17:28
 * @Version 1.0
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype) {
        return concretePrototype.clone();
    }
}
