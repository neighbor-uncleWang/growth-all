package org.wjw.provider.dubbo.callback;

import org.apache.dubbo.config.annotation.Argument;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.http.client.utils.DateUtils;
import org.wjw.test.dubbo.callback.CallbackListener;
import org.wjw.test.dubbo.callback.CallbackService;

import java.util.Date;

/**
 * @author laoWang
 * @ClassName CallbackServiceImpl.java
 * @createTime 2022-05-07 20:51
 */
@DubboService(methods = {@Method(name = "addListener", arguments = {@Argument(index = 1, callback = true)})})
public class CallbackServiceImpl implements CallbackService {

    @Override
    public void addListener(String key, CallbackListener listener) {
        System.out.println("=========支付操作=========");
        listener.changed("changed：" + DateUtils.formatDate(new Date()));
    }
}
