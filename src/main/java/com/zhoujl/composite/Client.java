package com.zhoujl.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zjl
 * @Date 2021/4/14 16:49
 * @Version 1.0
 **/
public class Client {

    public static String getTreeInfo(Branch root) {
        List<Corp> subordinateList = root.getSubordinateList();
        String info = "";
        for(Corp s :subordinateList){
            if(s instanceof Leaf){ //是员工就直接获得信息
                info = info + s.getInfo()+"\n";
            }else{ //是个小头目
                info = info+s.getInfo()+"\n"+ getTreeInfo((Branch)s);
            }
        }
        return info;

    }


}
