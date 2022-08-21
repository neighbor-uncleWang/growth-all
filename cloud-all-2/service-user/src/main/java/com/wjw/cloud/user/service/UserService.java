/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.wjw.cloud.user.service;

import com.wjw.cloud.service.IUserService;
import com.wjw.cloud.service.model.UserDO;
import com.wjw.cloud.user.dto.User;
import com.wjw.cloud.user.dto.UserDTO;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.beans.Transient;

/**
 * @author wjw01019072
 * @version : UserService.java, v 0.1 2022年07月28日 14:53 wjw01019072 Exp $
 */
@DubboService(loadbalance = "random")
public class UserService implements IUserService {

    @Autowired
    private UserDTO userDTO;


    @Override
    public String say(String msg) {
        User user = userDTO.selectById(1);

        return "Hello," + msg + ", I' Dubbo Service=====" + user.toString();
    }

    @Override
    @Transient
    public UserDO getUser(Long id) {
        User user = userDTO.selectById(id);
        UserDO userDO = new UserDO();

        BeanUtils.copyProperties(user, userDO);

        return userDO;
    }

    @Override
    @Transient
    public int updateUser(UserDO userDO) {
        User user = new User();
        BeanUtils.copyProperties(userDO, user);
        return userDTO.updateById(user);
    }

}