package org.wjw.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.wjw.api.DubboCloudService;

import static org.apache.dubbo.common.constants.ClusterRules.FAIL_BACK;

/**
 * @author laoWang
 * @ClassName DubboCloudServiceInmp.java
 * @createTime 2022-12-02 20:06
 */
@DubboService(version = "1.0.0",loadbalance = FAIL_BACK)
public class DubboCloudServiceImpl implements DubboCloudService {

    @Override
    public String getService() {
        System.out.println("this is dubbo service;");
        return "this is dubbo service;";
    }
}
