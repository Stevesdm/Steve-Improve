package com.steve.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/24 上午10:02
 */
public class Demo2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        map.put(2,"2");
        map.put(12,"12");
        map.put(1,"1");
        map.put(0,"0");
        map.put(5,"5");
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getValue());
        }

    }
}
