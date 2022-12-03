package org.wjw.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author laoWang
 * @ClassName SpringServiceApplication.java
 * @createTime 2022-12-02 19:45
 */
@EnableFeignClients(basePackages = "org.wjw.api.**")
@EnableDiscoveryClient
@SpringBootApplication
public class SpringServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceApplication.class, args);
    }

}
