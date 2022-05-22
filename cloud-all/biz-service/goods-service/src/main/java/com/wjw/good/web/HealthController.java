package com.wjw.good.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 心跳检测 web
 *
 * @author laoWang
 * @ClassName HealthController.java
 * @createTime 2022-05-22 21:41
 */
@Slf4j
@RestController
public class HealthController {

    @GetMapping("/healthCheck")
    public String health() {
        log.info("healthCheck......");
        return "SUCCESS";
    }
}
