package com.steve.hashmap;


import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/11/29 下午10:52
 */
public class HashMapDemo01 {

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

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
