package com.steve.proxy.dynamicdemo;

import com.steve.proxy.HelloWorld;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/13 下午11:16
 */
public class DynamicTest {

    @Test
    public void test() {
        HelloWorldImpl helloWorldImpl = new HelloWorldImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(helloWorldImpl);
        HelloWorld helloWorld = (HelloWorld) myInvocationHandler.getProxy();
        helloWorld.hello();
    }
}
