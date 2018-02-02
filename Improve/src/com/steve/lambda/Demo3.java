package com.steve.lambda;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/2/2 下午5:50
 */
public class Demo3 {

    public static void main(String[] args) {
        new Thread(()-> System.out.println("test")).start();
    }
}
