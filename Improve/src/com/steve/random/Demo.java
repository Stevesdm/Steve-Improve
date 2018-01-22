package com.steve.random;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/22 下午4:03
 */
public class Demo {


    public static void main(String[] args) {
//        Random random = new Random();
        final ThreadLocalRandom random = ThreadLocalRandom.current();

        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100000 ; i++) {
//            random.nextInt(5);
//        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    random.nextInt(5);
                }
            }
        });


        long end = System.currentTimeMillis();

        System.out.println(end - start + "ms");
    }

}
