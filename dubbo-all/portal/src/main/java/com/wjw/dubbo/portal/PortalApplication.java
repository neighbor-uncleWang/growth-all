package com.wjw.dubbo.portal;

import com.wjw.api.IUserService;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDiscoveryClient
//@EnableDubbo
public class PortalApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        IUserService userService = context.getBean(IUserService.class);
        String hello = userService.say("nacos");
        System.out.println("result: " + hello);
    }

    @Configuration
    @EnableDubbo(scanBasePackages = " com.wjw.dubbo.portal.web")
    @PropertySource("classpath:/application.properties")
    @ComponentScan(value = {"com.wjw.dubbo.portal.web"})
    static class ConsumerConfiguration {

    }

}
