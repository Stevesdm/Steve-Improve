package com.steve.proxy.staticdemo;

import com.steve.proxy.HelloWorld;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/13 下午11:05
 */
public class HelloworldProxy implements HelloWorld {

    private HelloworldImpl helloworldImpl;

    public HelloworldProxy(HelloworldImpl helloworldImpl) {
        this.helloworldImpl = helloworldImpl;
    }


    @Override
    public void hello() {
        System.out.println("------------------");
        helloworldImpl.hello();
        System.out.println("------------------");
    }
}
