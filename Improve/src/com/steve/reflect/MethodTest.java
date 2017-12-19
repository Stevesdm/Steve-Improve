package com.steve.reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/19 下午1:59
 */
public class MethodTest {

    @Test
    public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class userClass = User.class;

        User user = new User();
        System.out.println(user.getUid());

        Method m = userClass.getMethod("setUid", int.class);

        //调用私有方法或者属性的时候需要设置
//        m.setAccessible(true);

        m.invoke(user, 111);
        System.out.println(user.getUid());


    }


}
