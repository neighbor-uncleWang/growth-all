/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.wjw.cloud.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wjw01019072
 * @version : Appl.java, v 0.1 2022年07月28日 14:52 wjw01019072 Exp $
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.wjw.cloud.shop.dto")
@EnableTransactionManagement
public class ShopServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServiceApplication.class, args);
    }

}