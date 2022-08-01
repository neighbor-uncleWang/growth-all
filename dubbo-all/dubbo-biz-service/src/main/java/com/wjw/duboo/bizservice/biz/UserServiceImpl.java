package com.wjw.duboo.bizservice.biz;

import com.wjw.api.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author laoWang
 * @ClassName UserServiceImpl.java
 * @createTime 2022-07-31 10:55
 */
@DubboService(version = "1.0.0",loadbalance = "random")
public class UserServiceImpl implements IUserService {

    @Override
    public String say(String msg) {
        return "说了: " + msg;
    }

}
