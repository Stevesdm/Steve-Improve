package com.steve.reflect;

import com.steve.reflect.annotation.DemoAnnotation;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/18 下午10:32
 */
@DemoAnnotation(name = "aaa")
public class User {

    private int uid;

    private String uname;

    private int age;

    private String address = "sy";

    public User() {
    }

    public User(int uid) {
        this.uid = uid;
    }

    public User(int uid, String uname, int age, String address) {


        this.uid = uid;
        this.uname = uname;
        this.age = age;
        this.address = address;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
