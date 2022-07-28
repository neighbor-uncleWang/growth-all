/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.wjw.cloud.user.service;

import com.wjw.cloud.service.IUserService;

/**
 * @author wjw01019072
 * @version : UserService.java, v 0.1 2022年07月28日 14:53 wjw01019072 Exp $
 */
public class UserService implements IUserService {
    @Override
    public String say(String msg) {
        return "Hello," + msg + ", I' Dubbo Service";
    }
}