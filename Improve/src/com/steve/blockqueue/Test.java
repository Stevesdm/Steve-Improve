package com.steve.blockqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/11/23 下午10:22
 */
public class Test {


    @org.junit.Test
    public void test() throws Exception{

        BlockingQueue<String> queue = new LinkedBlockingDeque<>(20);
        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);
        Producer producer3 = new Producer(queue);
        Producer producer4 = new Producer(queue);

        Consumer consumer = new Consumer(queue);

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(producer1);
        executorService.execute(producer2);
        executorService.execute(producer3);
        executorService.execute(producer4);
        executorService.execute(consumer);

        Thread.sleep(10000);
        producer1.stop();
        producer2.stop();
        producer3.stop();
        producer4.stop();

        executorService.shutdown();

    }
}
