package com.steve.ThreadLocal;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/14 下午2:04
 */
public class Test {

    public static void main(String[] args) {
        HelloThreadLocal hello = new HelloThreadLocal();
        DemoThread t1 = new DemoThread(hello);
        DemoThread t2 = new DemoThread(hello);
        DemoThread t3 = new DemoThread(hello);

        t1.start();
        t2.start();
        ;
        t3.start();
    }
}
