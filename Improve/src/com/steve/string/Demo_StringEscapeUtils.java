package com.steve.string;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/24 上午11:06
 */
public class Demo_StringEscapeUtils {


    public static void main(String[] args) {
        String a1 = "<a href ='http://www.baidu.com'>测试</a>";
        String b1 = StringEscapeUtils.escapeHtml4(a1);
        System.out.println(b1);
        System.out.println(StringEscapeUtils.unescapeHtml4(b1));



    }
}
