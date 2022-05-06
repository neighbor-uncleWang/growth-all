package org.wjw.provider.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.wjw.test.dubbo.service.UserService;

/**
 * @author wjw
 * @ClassName UserServiceImpl.java
 * @createTime 2022-05-05 22:11
 */
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String queryUser(String userId) {
        System.out.println("=========UserServiceImpl#queryUser#start;=========");
        System.out.println("userId == " + userId);
        return "OK--" + userId;
    }

    @Override
    public void doKill(String killid) {
        System.out.println("UserServiceImpl#doKill#start;");
        System.out.println("killid == " + killid);

    }
}
