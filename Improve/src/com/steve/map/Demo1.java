package com.steve.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/23 下午6:15
 */
public class Demo1 {

    public static void main(String[] args) {
        Map<UserInfo,String> map = new TreeMap<>();
        UserInfo u1 = new UserInfo(1, 21, "name1");
        UserInfo u2 = new UserInfo(2, 27, "name1");
        UserInfo u3 = new UserInfo(3, 15, "name1");
        UserInfo u4 = new UserInfo(5, 24, "name1");
        UserInfo u5 = new UserInfo(4, 24, "name1");
        map.put(u1,"u1");
        map.put(u2,"u2");
        map.put(u3,"u3");
        map.put(u4,"u4");
        map.put(u5,"u5");
        System.out.println(map.get(u3));

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getValue());
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
