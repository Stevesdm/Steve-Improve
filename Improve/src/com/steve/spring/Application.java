package com.steve.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/19 下午2:44
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    @Lazy()
    public MessageService getMessageService() {
        return new MessageService() {
            @Override
            public String getMessage() {
                return "hello world!!!!";
            }
        };
    }

    public static void main(String[] args) {
        BeanFactory ctx = new AnnotationConfigApplicationContext(Application.class);
        Hello hello = (Hello) ctx.getBean("hello");
        //  Hello hello = (Hello)ctx.getBean(Hello.class);
        hello.hello();
    }
}
