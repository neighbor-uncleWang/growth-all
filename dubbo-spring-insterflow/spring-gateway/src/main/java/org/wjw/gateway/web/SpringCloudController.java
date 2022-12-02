package org.wjw.gateway.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wjw.api.SpringCouldService;

import javax.annotation.Resource;

/**
 * @author laoWang
 * @ClassName SpringColudController.java
 * @createTime 2022-12-02 19:58
 */
@RestController
@RequestMapping("/springCouldService")
public class SpringCloudController {

    @Resource
    private SpringCouldService springCouldService;

    @GetMapping("/service")
    public String getService() {
        String service = springCouldService.getService();
        return service;
    }
}
