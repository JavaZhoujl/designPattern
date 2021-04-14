package com.zhoujl.chain;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 10:17
 * @Version 1.0
 **/
public class FatherHandler extends AbsHandler {

    @Override
    protected void setType(int type) {
        super.setType(type);
    }

    @Override
    protected void setNextHandler(AbsHandler handler) {
        super.nextHandler = handler;
    }

    @Override
    protected void Response(String message) {
        System.out.println(message);
        System.out.println("父亲同意，女儿的请求！");
    }
}
