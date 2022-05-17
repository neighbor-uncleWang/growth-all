package com.wjw.all.springbootall.test;

import com.wjw.all.springbootall.SpringbootallApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author laoWang
 * @ClassName MyTest.java
 * @createTime 2022-05-16 19:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootallApplication.class)
@WebAppConfiguration
public class MyTest {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void value() {
        String property = applicationContext.getEnvironment().getProperty("cn.username");
        System.out.println(property);
    }
}
