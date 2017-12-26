package com.steve.transientdemo;

import java.io.*;
import java.util.Date;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/26 下午5:18
 */
public class Test {


    //正常序列化反序列化
    @org.junit.Test
    public void test1() throws IOException, ClassNotFoundException {
        User1 user1 = new User1();
        user1.setId(1);
        user1.setUserName("steve");
        user1.setDate(new Date());

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
                new File("0xjh000")));
        out.writeObject(user1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                new File("0xjh000")));
        User1 testUser = (User1) in.readObject();
        in.close();

        System.out.println(testUser.getId());
        System.out.println(testUser.getUserName());
        System.out.println(testUser.getDate());

    }

    //transient修饰的不进行序列化
    //static修饰的从不序列化
    @org.junit.Test
    public void test2() throws IOException, ClassNotFoundException {
        User2 user2 = new User2();
        user2.setId(1);
        user2.setUserName("steve");
        user2.setDate(new Date());

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
                new File("0xjh001")));
        out.writeObject(user2);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                new File("0xjh001")));
        User2 testUser = (User2) in.readObject();
        in.close();

        System.out.println(testUser.getId());
        System.out.println(testUser.getUserName());
        System.out.println(testUser.getDate());

    }
}
