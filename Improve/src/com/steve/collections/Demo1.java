package com.steve.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/23 下午2:29
 *
 *
 * Comparator和Comparable区别：http://blog.csdn.net/tolcf/article/details/52229068
 */
public class Demo1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(10);
        for (Integer i : list){
            System.out.println(i);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer i : list){
            System.out.println(i);
        }


    }
}
