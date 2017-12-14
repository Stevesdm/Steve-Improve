package com.steve.blockqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/11/23 下午10:16
 */
public class Consumer implements Runnable {


    private BlockingQueue<String> queue;
    private static final int SLEEP_TIME = 1000;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        System.out.println("----start consumer-----");
        Random r = new Random();

        Boolean isRunning = true;
        try {
            while (isRunning) {
                System.out.println("----get data form producer queue----");
                String data = queue.poll(2, TimeUnit.SECONDS);
                if (data != null) {
                    System.out.println("get data:" + data);
                    Thread.sleep(r.nextInt(SLEEP_TIME));
                } else {
                    isRunning = false;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("-----consumer end ----");
        }

    }
}
