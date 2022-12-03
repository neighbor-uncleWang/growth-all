package org.wjw.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author laoWang
 * @ClassName SpringServiceApplication.java
 * @createTime 2022-12-02 19:45
 */
@EnableDubbo
@SpringBootApplication
public class DubboServiceApplication {

    public static void main(String[] args) throws Exception {
        //需要在AbstractRegistry#notify() 508行断点才行
        SpringApplication.run(DubboServiceApplication.class, args);
        new CountDownLatch(1).wait();
    }

}
