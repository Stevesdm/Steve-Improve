package com.steve.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/2/2 下午5:32
 */
public class Demo2 {

    public static void main(String[] args) {
        List<String> list = Stream.of("a","01aa","bd").filter(a -> a.contains("0")).collect(Collectors.toList());
        list.forEach(a -> System.out.println(a));

        String demo = Stream.of("Steve","Jobson","helloworld").min(Comparator.comparing(a -> a.length())).get();
        System.out.println(demo);

    }
}
