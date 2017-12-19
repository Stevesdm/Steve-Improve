package com.steve.reflect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/19 下午2:18
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DemoAnnotation {

    String name() default "steve";

    String age() default "18";
}
