package com.wjw.cloud.gportal.sentinel;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @author laoWang
 * @ClassName ExceptionUtils.java
 * @createTime 2022-08-01 20:58
 */
public class ExceptionUtils {

    public static String handlerTest01Exception(BlockException e) {
        System.out.println("Occur BlockException:" + e);
        return e.getMessage();
    }

}
