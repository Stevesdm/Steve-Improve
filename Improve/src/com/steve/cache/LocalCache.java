package com.steve.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/15 下午9:45
 */
public class LocalCache {

    static Cache<String, String> cache = CacheBuilder.newBuilder()
            .expireAfterWrite(5, TimeUnit.SECONDS)
            .build();


    @Test
    public void test() throws InterruptedException {
        cache.put("name","steve");
        cache.put("age","18");
        System.out.println(cache.getIfPresent("age"));
        System.out.println(cache.getIfPresent("name"));
        System.out.println(cache.size());
        System.out.println("---------");
        Thread.sleep(6000);
        System.out.println(cache.getIfPresent("age"));
        System.out.println(cache.getIfPresent("name"));
        System.out.println(cache.size());


    }
}
