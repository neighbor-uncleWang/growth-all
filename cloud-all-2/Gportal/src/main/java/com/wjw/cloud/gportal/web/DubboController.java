/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.wjw.cloud.gportal.web;

import com.wjw.cloud.service.IShopService;
import com.wjw.cloud.service.IUserService;
import com.wjw.cloud.service.model.ShopDO;
import com.wjw.cloud.service.model.UserDO;
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
    @DubboReference(cluster = "failfast")
    IShopService shopService;

    @GetMapping("/say")
    public String say() {
        return helloService.say("wjw");
    }

    @GetMapping("/tr/say")
    public String trSay() {
        UserDO user = helloService.getUser(1L);
        ShopDO shop = shopService.getShop(1L);
        user.setMoney(100);
        shop.setPrice(6);

//        helloService.updateUser(user);
//        shopService.updateShop(shop);
        return user.toString() + "=====" + shop.toString();
    }
}