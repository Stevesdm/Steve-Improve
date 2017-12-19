package com.steve.ThreadLocal;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/14 上午10:18
 */
public class HelloThreadLocal {


    //每个使用该变量的线程提供独立的变量副本，所以每一个线程都可以独立地改变自己的副本，而不会影响其它线程所对应的副本

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public int getNext() {
        threadLocal.set(threadLocal.get() + 1);
        return threadLocal.get();
    }
}
