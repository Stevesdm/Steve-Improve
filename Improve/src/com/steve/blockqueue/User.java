package com.steve.blockqueue;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/11/28 下午12:38
 */
public class User {

    private int id;
    private String name;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
