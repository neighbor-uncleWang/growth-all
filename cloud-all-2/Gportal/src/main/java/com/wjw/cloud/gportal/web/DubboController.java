/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.wjw.cloud.gportal.web;

import com.wjw.cloud.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wjw01019072
 * @version : DubboController.java, v 0.1 2022年07月28日 14:39 wjw01019072 Exp $
 */
@RestController
public class DubboController {

    @DubboReference(cluster = "failfast")
    IUserService helloService;

    @GetMapping("/say")
    public String say(){
        return helloService.say("wjw");
    }

}