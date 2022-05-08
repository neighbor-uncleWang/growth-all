package org.wjw.consumer.dubbo.dubbospi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author laoWang
 * @ClassName ActivateApi.java
 * @createTime 2022-05-08 14:16
 */
@SPI("spring")
public interface ActivateApi {
    @Adaptive
    String todo(String param, URL url);
}
