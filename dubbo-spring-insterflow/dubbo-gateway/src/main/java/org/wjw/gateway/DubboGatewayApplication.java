package org.wjw.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author laoWang
 * @ClassName SpringServiceApplication.java
 * @createTime 2022-12-02 19:45
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DubboGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboGatewayApplication.class, args);
    }

}
