package com.steve.list;


import java.util.Arrays;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/11 下午12:48
 */
public class Demo01 {


    public static void main(String[] args) {

        //asList参数是泛型，传基本类型进去返回集合大小为1，如果换为Integer则返回true
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.asList(a).contains(2));
    }
}
