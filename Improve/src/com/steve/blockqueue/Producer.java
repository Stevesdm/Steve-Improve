package com.steve.blockqueue;

import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/11/23 下午10:07
 */
public class Producer implements Runnable {

    private volatile boolean isRunning = true;
    private BlockingQueue queue;
    private static AtomicInteger count = new AtomicInteger();
    private static final int SLEEP_TIME = 1000;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        String data = null;
        Random r = new Random();
        System.out.println("-----producer start running-----");

        try {
            while (isRunning) {
                System.out.println("-----producer is producing data-----");
                Thread.sleep(r.nextInt(SLEEP_TIME));

                data = "data" + count.incrementAndGet();
                System.out.println("-----store data to queue-----");
                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {
                    System.out.println("----failed to store data-----");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("-----end----");
        }
    }

    public void stop() {
        this.isRunning = false;
    }
}
