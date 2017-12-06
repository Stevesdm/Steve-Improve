package com.steve.hashmap;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import static java.util.Objects.hash;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/11/29 下午10:57
 */
public class HashMapDemo01Test {

    @Test
    public void test01() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        map.put(null,2);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() );

        }
        System.out.println(map.containsValue(null));
        System.out.println(map.containsKey(null));

        System.out.println(2<<4);

        System.out.println(DigestUtils.sha256Hex("stevejobson"));

    }


    @Test
    public void test02() throws InterruptedException {
        Map<String, Integer> map = new WeakHashMap<>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        map.put(null,2);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() );

        }
        System.out.println(map.containsValue(null));
        System.out.println(map.containsKey(null));

        System.out.println(map.size());

        Thread.sleep(3000);


        System.out.println(map.size());

    }


}
