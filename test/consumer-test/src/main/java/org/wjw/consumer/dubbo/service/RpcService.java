package org.wjw.consumer.dubbo.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wjw.consumer.dubbo.config.ConsumerConfiguration;
import org.wjw.test.dubbo.service.UserService;

/**
 * @author laoWang
 * @ClassName RpcService.java
 * @createTime 2022-05-06 22:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConsumerConfiguration.class)
public class RpcService {


    @DubboReference(check = false)
    private UserService userService;

    @Test
    public void test1() {
        System.out.println("========开始=============");
        System.out.println(userService.queryUser("WUYA"));
    }

}
