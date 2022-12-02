package org.wjw.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.concurrent.CountDownLatch;

/**
 * @author laoWang
 * @ClassName SpringServiceApplication.java
 * @createTime 2022-12-02 19:45
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DubboServiceApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DubboServiceApplication.class, args);
        new CountDownLatch(1).wait();
    }

}
