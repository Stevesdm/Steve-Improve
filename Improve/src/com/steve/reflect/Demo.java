package com.steve.reflect;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/18 下午10:31
 */
public class Demo {

    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class userClass = User.class;


        Class userClass = null;
        try {
            userClass = Class.forName("com.steve.reflect.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //class name
        System.out.println(userClass.getName());

        //simple name
        System.out.println(userClass.getSimpleName());

        Package pac = userClass.getPackage();
        System.out.println(pac);

        int modifiers = userClass.getModifiers();
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
        System.out.println("-----");
        for (Class c : interfaces) {
            System.out.println(c);
            System.out.println(c.getSimpleName());
        }
        System.out.println("------");

        Constructor[] constructors = userClass.getConstructors();
        System.out.println("-------");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
        }
        System.out.println("-------");
        Constructor con = userClass.getConstructor(new Class[]{int.class});
        System.out.println(con.getName());
        User user1 = (User) con.newInstance(1);
        System.out.println(user1);
        System.out.println("---------000-----");


        Method[] methods = userClass.getMethods();
        System.out.println("------");
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }


        Field[] fields = userClass.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }


        System.out.println("------");

        Annotation[] annotations = userClass.getAnnotations();


        User user;
        try {
            user = (User) userClass.newInstance();
            System.out.println(user);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
