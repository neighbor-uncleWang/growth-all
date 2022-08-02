package com.wjw.cloud.gportal.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import org.springframework.stereotype.Service;

/**
 * @author laoWang
 * @ClassName SentinelAnnotaionController.java
 * @createTime 2022-08-01 20:52
 */
@Service
public class SentinelAnnotationService {

    //    @SentinelResource(value = "test01",
//            blockHandler = "handlerTest01Exception",
//            blockHandlerClass = ExceptionUtils.class)
//    public String test01() {
//        System.out.println("Test01 Success");
//        //这里有问题 需要手动抛出流控异常才能捕获
////        throw new FlowException("手动异常");
////        return "Test01 Success";
//    }

    @SentinelResource(value = "test01",
            blockHandler = "handlerTest01Exception",
            blockHandlerClass = ExceptionUtils.class)
    public String test01() {
        System.out.println("Test01 Success");
        return "Test01 Success";
    }


}
