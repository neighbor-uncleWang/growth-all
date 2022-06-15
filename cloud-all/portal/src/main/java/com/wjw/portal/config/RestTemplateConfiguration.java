package com.wjw.portal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration
public class RestTemplateConfiguration {

//    @LoadBalanced
//    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        String goodsInfo = new RestTemplate().getForObject("url", String.class);

    }
}
