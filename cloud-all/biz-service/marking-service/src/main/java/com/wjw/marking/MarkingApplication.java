package com.wjw.marking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MarkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarkingApplication.class, args);
    }

}
