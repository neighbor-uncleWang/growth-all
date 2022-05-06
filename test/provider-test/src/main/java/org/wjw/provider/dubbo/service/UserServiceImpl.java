package org.wjw.provider.dubbo.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.wjw.test.dubbo.service.UserService;

/**
 * @author wjw
 * @ClassName UserServiceImpl.java
 * @createTime 2022-05-05 22:11
 */
@DubboService
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public String queryUser(String userId) {
        log.info("=========UserServiceImpl#queryUser#start;=========");
        log.info("userId == " + userId);
        return "OK--" + userId;
    }

    @Override
    public void doKill(String killid) {
        log.info("UserServiceImpl#doKill#start;");
        log.info("killid == " + killid);

    }
}
