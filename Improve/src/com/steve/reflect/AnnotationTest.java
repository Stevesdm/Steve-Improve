package com.steve.reflect;

import com.steve.reflect.annotation.DemoAnnotation;
import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/19 下午2:20
 */
public class AnnotationTest {

    @Test
    public void test() {


        Annotation annotation = User.class.getAnnotation(DemoAnnotation.class);

        if (annotation instanceof DemoAnnotation) {
            System.out.println(((DemoAnnotation) annotation).age());
            System.out.println(((DemoAnnotation) annotation).name());
        }
    }
}
