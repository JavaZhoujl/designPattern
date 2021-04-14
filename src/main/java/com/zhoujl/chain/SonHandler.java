package com.zhoujl.chain;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 10:20
 * @Version 1.0
 **/
public class SonHandler extends AbsHandler {

    @Override
    public void setType(int type) {
        super.setType(type);
    }

    @Override
    protected void setNextHandler(AbsHandler handler) {
        super.nextHandler = handler;
    }

    @Override
    protected void Response(String message) {
        System.out.println(message);
        System.out.println("儿子同意，母亲的请求！");
    }
}
