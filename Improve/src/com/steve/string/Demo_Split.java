package com.steve.string;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/31 下午2:19
 */
public class Demo_Split {


    public static void main(String[] args) {
        //1、如果用“.”作为分隔的话,必须是如下写法,String.split("\\."),这样才能正确的分隔开,不能用String.split(".");
        String[] demo1 = "a.b.c".split("\\.");
        for (String a : demo1){
            System.out.println(a);
        }

        //2、如果用“|”作为分隔的话,必须是如下写法,String.split("\\|"),这样才能正确的分隔开,不能用String.split("|");“.”和“|”都是转义字符,必须得加"\\";
        String[] demo2 = "a|b|c".split("\\|");
        for (String a : demo2){
            System.out.println(a);
        }

        //3、如果在一个字符串中有多个分隔符,可以用“|”作为连字符,比如,“acount=? and uu =? or n=?”,把三个都分隔出来,可以用String.split("and|or");
        String[] demo3 = "acount=? and uu =? or n=?".split("and|or");
        for (String a : demo3){
            System.out.println(a);
        }

    }
}
