package com.zhoujl.proxy.dbroute;

/**
 * @Author zhoujl
 * @Date 2019/4/18 22:06
 * @Version 1.0
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
