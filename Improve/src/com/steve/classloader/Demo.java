package com.steve.classloader;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/29 下午2:03
 */
public class Demo {

    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
