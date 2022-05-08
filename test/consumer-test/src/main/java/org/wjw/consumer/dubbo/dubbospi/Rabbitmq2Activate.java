package org.wjw.consumer.dubbo.dubbospi;

import org.apache.dubbo.common.URL;

/**
 * @author laoWang
 * @ClassName Rabbitmq2Activate.java
 * @createTime 2022-05-08 14:16
 */
public class Rabbitmq2Activate implements ActivateApi {
    @Override
    public String todo(String param, URL url) {
        return param;
    }
}
