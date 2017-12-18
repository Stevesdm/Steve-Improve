package com.steve.reflect;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/18 下午10:32
 */
public class User {

    private int uid = 1000;

    private String uname = "steve";

    private int age = 18;

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
}
