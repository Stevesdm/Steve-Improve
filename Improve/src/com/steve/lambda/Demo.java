package com.steve.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/2/2 下午5:10
 */
public class Demo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("demo"+i);
        }

        long count = list.stream().filter(a ->{
            System.out.println(a);
            return a.equals("demo1");
        }).count();


        System.out.println(count);
    }
}
