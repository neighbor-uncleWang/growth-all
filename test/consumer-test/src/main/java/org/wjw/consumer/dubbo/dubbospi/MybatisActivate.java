package org.wjw.consumer.dubbo.dubbospi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.DisableInject;

/**
 * @author laoWang
 * @ClassName MybatisActivate.java
 * @createTime 2022-05-08 14:16
 */
public class MybatisActivate implements ActivateApi {

    private ActivateApi  activateApi;

    @Override
    public String todo(String param, URL url) {
        return param;
    }

    public void setActivateApi(ActivateApi activateApi) {
        this.activateApi = activateApi;
        System.out.println(activateApi);
    }
}
