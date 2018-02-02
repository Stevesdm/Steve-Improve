package com.steve.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/2/1 上午10:00
 */
public class Demo {

    public static void main(String[] args) {
        List<Person<String>> list = new ArrayList();

    }
}


class Person<T>{
    private T a1;
    private T a2;
}
