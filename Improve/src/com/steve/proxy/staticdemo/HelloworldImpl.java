package com.steve.proxy.staticdemo;

import com.steve.proxy.HelloWorld;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/13 下午11:02
 */
public class HelloworldImpl implements HelloWorld {
    @Override
    public void hello() {
        System.out.println("static hello world !!");
    }
}
