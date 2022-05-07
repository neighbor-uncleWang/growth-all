package org.wjw.consumer.dubbo.test;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wjw.consumer.dubbo.config.ConsumerConfiguration;
import org.wjw.test.dubbo.callback.CallbackListener;
import org.wjw.test.dubbo.callback.CallbackService;

/**
 * @author laoWang
 * @ClassName DubootEST.java
 * @createTime 2022-05-07 21:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConsumerConfiguration.class)
public class DubooTest {


    @DubboReference(check = false)
    private CallbackService callbackService;

    @Test
    public void callback_test(){
        callbackService.addListener("laowang", new CallbackListener() {
            @Override
            public void changed(String msg) {
                System.out.println("回调之后的逻辑，"+msg);
            }
        });

    }
}
