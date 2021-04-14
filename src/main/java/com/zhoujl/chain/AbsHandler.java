package com.zhoujl.chain;

import java.util.Objects;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 10:13
 * @Version 1.0
 **/
public abstract class AbsHandler {

    private int type;

    protected AbsHandler nextHandler;

    public final void handlerMessage(IWomen women) {
        if(Objects.equals(women.getType(), this.type)) {
            this.Response(women.getRequest());
        }else {
            nextHandler.handlerMessage(women);
        }
    }

    protected void setType(int type) {
        this.type = type;
    }

    protected abstract void setNextHandler(AbsHandler handler);

    protected abstract void Response(String message);
}
