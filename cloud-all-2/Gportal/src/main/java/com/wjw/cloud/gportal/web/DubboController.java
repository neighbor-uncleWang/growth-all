/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.wjw.cloud.gportal.web;

import com.wjw.cloud.service.IShopService;
import com.wjw.cloud.service.IUserService;
import com.wjw.cloud.service.model.ShopDO;
import com.wjw.cloud.service.model.UserDO;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.transaction.annotation.Transactional;
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
//    @GlobalTransactional
    @GlobalTransactional(timeoutMills = 5000)
    public String trSay() {
        //查询用户和商品
        UserDO user = helloService.getUser(1L);
        ShopDO shop = shopService.getShop(1L);
        //用户花钱买商品 10件
        Integer sum = 10;
        Integer totalPrice = shop.getPrice() * sum;

        Integer money = user.getMoney() - totalPrice;
        Integer count = shop.getCount() - sum;

        user.setMoney(money);
        shop.setCount(count);

        helloService.updateUser(user);

        System.out.println("=========================");

        shopService.updateShop(shop);

        return user.toString() + "=====" + shop.toString();
    }
}