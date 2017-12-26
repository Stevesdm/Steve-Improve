package com.steve.transientdemo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/26 下午5:15
 */
public class User2 implements Serializable {

    private transient int id;
    private transient String userName;
    private transient Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
