package org.wjw.gateway;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author laoWang
 * @ClassName SpringServiceApplication.java
 * @createTime 2022-12-02 19:45
 */
@EnableDubbo
@SpringBootApplication
public class DubboGatewayApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DubboGatewayApplication.class, args);
    }

}
