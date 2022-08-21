/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.wjw.cloud.service;

import com.wjw.cloud.service.model.UserDO;

/**
 * @author wjw01019072
 * @version : IUserService.java, v 0.1 2022年07月28日 14:44 wjw01019072 Exp $
 */
public interface IUserService {
    /**
     * @param msg
     * @return
     */
    String say(String msg);


    /**
     * @param id
     * @return
     */
    public UserDO getUser(Long id);

    /**
     * @param user
     * @return
     */
    public int updateUser(UserDO user);
}