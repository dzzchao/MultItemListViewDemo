package com.dzzchao.multitemlistviewdemo.bean;

/**
 *数据对象实体类
 *
 * Created by zhang on 7/6/2016.
 */
public class DataBean {

    private int type;
    private String name;
    private String age;

    public DataBean(int type, String name, String age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DataBean{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}