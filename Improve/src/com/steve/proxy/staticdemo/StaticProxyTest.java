package com.steve.proxy.staticdemo;

import org.junit.Test;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/13 下午11:04
 */
public class StaticProxyTest {

    @Test
    public void test() {
        HelloworldImpl helloworldImpl = new HelloworldImpl();
        HelloworldProxy helloworldProxy = new HelloworldProxy(helloworldImpl);
        helloworldProxy.hello();
    }
}
