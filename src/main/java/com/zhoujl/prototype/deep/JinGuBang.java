package com.zhoujl.prototype.deep;

import java.io.Serializable;

/**
 * @Author zhoujl
 * @Date 2019/4/18 17:26
 * @Version 1.0
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
