package org.wjw.consumer.dubbo.dubbospi;

import org.apache.dubbo.common.URL;

/**
 * @author laoWang
 * @ClassName RabbitmqActivate.java
 * @createTime 2022-05-08 14:16
 */
public class RabbitmqActivate implements ActivateApi {
    @Override
    public String todo(String param, URL url) {
        return param;
    }
}
