package com.zhoujl.prototype.deep;


public class DeepCloneTest {

    public static void main(String[] args) {

        Sunwukong qiTianDaSheng = new Sunwukong();
        try {
            Sunwukong clone = (Sunwukong)qiTianDaSheng.clone();
            System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Sunwukong q = new Sunwukong();
        Sunwukong n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.jinGuBang == n.jinGuBang));


    }
}
