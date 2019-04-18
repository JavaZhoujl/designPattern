package com.zhoujl.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * @Author zhoujl
 * @Date 2019/4/18 17:34
 * @Version 1.0
 */
public class Sunwukong extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    public Sunwukong() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try{
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Sunwukong copy = (Sunwukong)ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Sunwukong shallowClone(Sunwukong target){

        Sunwukong qiTianDaSheng = new Sunwukong();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.height;

        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return  qiTianDaSheng;
    }
}
