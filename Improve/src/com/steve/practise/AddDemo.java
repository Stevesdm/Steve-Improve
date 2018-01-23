package com.steve.practise;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/23 下午3:07
 */
public class AddDemo {

    public static int add (int a, int b){
        if (b == 0){
            return a;
        }
        int sum = a^b;
        int carry = (a&b) << 1;
        return add(sum, carry);
    }

    public static void main(String[] args) {
        System.out.println(add(1,10));
    }


}
