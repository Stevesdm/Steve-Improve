package com.steve.reflect;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/18 下午10:31
 */
public class Demo {

    @Test
    public void test(){
        Class userClass = User.class;

        //class name
        System.out.println(userClass.getName());

        //simple name
        System.out.println(userClass.getSimpleName());

        int modifiers= userClass.getModifiers();
        System.out.println(Modifier.isAbstract(modifiers));
        System.out.println(Modifier.isFinal(modifiers));
        System.out.println(Modifier.isInterface(modifiers));
        System.out.println(Modifier.isNative(modifiers));
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isProtected(modifiers));
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isStatic(modifiers));
        System.out.println(Modifier.isStrict(modifiers));
        System.out.println(Modifier.isSynchronized(modifiers));
        System.out.println(Modifier.isTransient(modifiers));
        System.out.println(Modifier.isVolatile(modifiers));


        System.out.println(userClass.getPackage());
        Class parentClass = userClass.getSuperclass();

        System.out.println(parentClass.getSimpleName());

        Class[] interfaces = userClass.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c.getSimpleName());
        }

        Constructor[] constructors = userClass.getConstructors();
        for (Constructor constructor: constructors) {
            System.out.println(constructor.getName());
        }

        Method[] methods = userClass.getMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
        }

        Annotation[] annotations = userClass.getAnnotations();


        User user;
        try {
            user = (User)userClass.newInstance();
            System.out.println(user);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
