package com.wjw.dubbo.portal.web;

import com.wjw.api.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author laoWang
 * @ClassName UserController.java
 * @createTime 2022-07-31 16:28
 */
@Component("userController")
public class UserController {

    @DubboReference(version = "1.0.0",cluster = "failfast")
    IUserService userService;

    public String say(){
        return userService.say("wjw");
    }

}
