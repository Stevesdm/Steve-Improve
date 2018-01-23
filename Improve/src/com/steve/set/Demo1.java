package com.steve.set;

import java.util.*;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/23 下午3:21
 */
public class Demo1 {
    public static void main(String[] args) {


        Set<UserInfo> set = new TreeSet<>();
        set.add(new UserInfo(1, 21, "name1"));
        set.add(new UserInfo(2, 27, "name1"));
        set.add(new UserInfo(3, 15, "name1"));
        set.add(new UserInfo(5, 24, "name1"));
        set.add(new UserInfo(4, 24, "name1"));

        Iterator<UserInfo> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class UserInfo implements Comparable<UserInfo> {
    private int userid;
    private int age;
    private String name;

    public UserInfo(int userid, int age, String name) {
        this.userid = userid;
        this.age = age;
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.userid + "," + this.age + "," + this.name;
    }

    @Override
    public int compareTo(UserInfo o) {
        //如果年龄相同，则比较userid，也可以直接  return this.age-o.age;
        if (this.age - o.age == 0) {
            return this.userid - o.userid;
        } else {
            return this.age - o.age;
        }
    }
}