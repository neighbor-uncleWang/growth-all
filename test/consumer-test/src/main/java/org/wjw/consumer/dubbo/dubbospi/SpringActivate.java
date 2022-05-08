package org.wjw.consumer.dubbo.dubbospi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * @author laoWang
 * @ClassName SpringActivate.java
 * @createTime 2022-05-08 14:16
 */
public class SpringActivate implements ActivateApi {
    @Override
    public String todo(String param, URL url) {
        return param;
    }
}
