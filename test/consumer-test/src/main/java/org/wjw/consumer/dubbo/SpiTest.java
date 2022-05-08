package org.wjw.consumer.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.wjw.consumer.dubbo.dubbospi.ActivateApi;

/**
 * @author laoWang
 * @ClassName SPItEST.java
 * @createTime 2022-05-08 14:32
 */
public class SpiTest {

    @Test
    public void adaptive() {
        ActivateApi adaptiveExtension = ExtensionLoader.getExtensionLoader(ActivateApi.class).getAdaptiveExtension();
//        ExtensionLoader<ActivateApi> extensionLoader = ExtensionLoader.getExtensionLoader(ActivateApi.class);
//        ActivateApi adaptiveExtension = extensionLoader.getExtension("dubbo");
        System.out.println(adaptiveExtension.getClass());
    }

}
