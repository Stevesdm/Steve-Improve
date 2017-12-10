package com.steve.practise;

import org.junit.Test;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/5 下午10:03
 */
public class AutoBoxingPerformance {

    /**
     * 程序尽量避免创建对象。
     */


    /**
     * 声明sum的时候使用Long对象
     * 程序构造了2^31次的多余Long实例
     * 两段程序的执行时间差距很大
     */
    @Test
    public void demo1() {
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void demo2() {
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }


}
