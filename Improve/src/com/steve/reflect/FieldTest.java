package com.steve.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/19 下午2:06
 */
public class FieldTest {

    @Test
    public void test() throws NoSuchFieldException, IllegalAccessException {

        User u = new User(1111);

        Field field = User.class.getDeclaredField("uid");
        field.setAccessible(true);
        int value = (int) field.get(u);
        System.out.println(value);
    }
}
