package com.steve.reflect;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/19 下午6:07
 */
public class Demo2 {

    @Test
    public void test() throws ClassNotFoundException {

        //执行的时候不会加载类，也不会执行静态代码
        Class userClass = User.class;

        //要求jvm执行指定的类，并加载该类，执行静态代码
        //Class userClass = Class.forName("com.steve.reflect.User");
    }
}
