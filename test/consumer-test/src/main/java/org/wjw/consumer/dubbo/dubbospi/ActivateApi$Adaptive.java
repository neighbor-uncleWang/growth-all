package org.wjw.consumer.dubbo.dubbospi;


import org.apache.dubbo.common.extension.ExtensionLoader;


/**
 * dubboSpi生成的spi的实现类
 *
 * @author laoWang
 * @ClassName ActivateApi$Adaptive.java
 * @createTime 2022-05-08 14:16
 */
public class ActivateApi$Adaptive implements ActivateApi {
    public String todo(String arg0, org.apache.dubbo.common.URL arg1) {
        if (arg1 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg1;
        String extName = url.getParameter("activate.api", "spring");
        if (extName == null)
            throw new IllegalStateException("Failed to get extension (org.wjw.consumer.dubbo.dubbospi.ActivateApi) name from url (" + url.toString() + ") use keys([activate.api])");
        org.wjw.consumer.dubbo.dubbospi.ActivateApi extension = (org.wjw.consumer.dubbo.dubbospi.ActivateApi) ExtensionLoader.getExtensionLoader(org.wjw.consumer.dubbo.dubbospi.ActivateApi.class).getExtension(extName);
        return extension.todo(arg0, arg1);
    }
}
