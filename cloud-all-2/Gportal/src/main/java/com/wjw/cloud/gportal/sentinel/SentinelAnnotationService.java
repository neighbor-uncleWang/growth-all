package com.wjw.cloud.gportal.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author laoWang
 * @ClassName SentinelAnnotaionController.java
 * @createTime 2022-08-01 20:52
 */
@Service
public class SentinelAnnotationService {

    @SentinelResource(value = "test01",
            blockHandler = "handlerTest01Exception",
            blockHandlerClass = ExceptionUtils.class)
    public String test01() {
        System.out.println("Test01 Success");
        return "Test01 Success";
    }

    @SentinelResource(value = "test02", fallback = "test02Fallback")
    public String test02() {
        return "Hello,Mic";
    }

    public String test02Fallback() {
        return "Hello, I'm Fallback";
    }

}
