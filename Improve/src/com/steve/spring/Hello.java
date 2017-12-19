package com.steve.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/19 下午2:47
 */
@Component
public class Hello {

    static {
        System.out.println("hello bean load...");
    }

    @Autowired
    private MessageService service;

    public void hello() {
        System.out.println(this.service.getMessage());
    }
}
