package com.steve.proxy.dynamicdemo;

import com.steve.proxy.HelloWorld;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/13 下午11:13
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void hello() {
        System.out.println("dynamic hello world");
    }
}
