package org.wjw.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laoWang
 * @ClassName SrpingDemo.java
 * @createTime 2022-05-09 21:52
 */
public class SpringDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml地址");
        context.getBean("name");

    }

}
