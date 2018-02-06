package com.steve.jvm;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/2/6 下午3:29
 */
public class LoaderTest {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = LoaderTest.class.getClassLoader();
        //classLoader.loadClass("com.steve.jvm.User"); //不执行静态代码块中的方法

       // Class.forName("com.steve.jvm.User");   //执行静态代码块中的代码

       // Class.forName("com.steve.jvm.User",false,classLoader); //执行static代码块

        Class a = User.class;//不执行static代码块
        

        //加载类的时候，双亲委派模型，AppClassLoader交给ExtClassLOader加载，Ext交给BootstrapClassLoader加载，没有的话再往下，如果到最后都没有，那么报错ClassNotFound

    }
}
