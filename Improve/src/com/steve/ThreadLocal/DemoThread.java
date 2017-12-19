package com.steve.ThreadLocal;

import org.junit.Test;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/14 上午10:22
 */
public class DemoThread extends Thread {

    private HelloThreadLocal helloThreadLocal;

    public DemoThread(HelloThreadLocal helloThreadLocal) {
        this.helloThreadLocal = helloThreadLocal;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName:" + DemoThread.currentThread().getName() + "HelloThread value:" + helloThreadLocal.getNext());
        }
    }
}
