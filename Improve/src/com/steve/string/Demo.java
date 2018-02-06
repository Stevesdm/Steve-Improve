package com.steve.string;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/22 下午6:45
 */
public class Demo {

    public static void main(String[] args) {

        //阿里巴巴规范，判断最后一个分隔符前有木有元素
        String str ="a,v,c,,";
        String[] d = str.split(",");
        System.out.println(d.length);

        int a = 321;

    }


}
