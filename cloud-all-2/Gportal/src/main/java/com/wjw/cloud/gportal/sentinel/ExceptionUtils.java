package com.wjw.cloud.gportal.sentinel;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author laoWang
 * @ClassName ExceptionUtils.java
 * @createTime 2022-08-01 20:58
 */
public class ExceptionUtils {

//    public static String handlerTest01Exception(BlockException e) {
//        System.out.println("1231321 Occur BlockException:" + e);
//        return "1231321 Occur BlockException";
//    }

    public static String handlerTest01Exception(BlockException e){
        System.out.println("Occur BlockedException:"+e);
        return e.getMessage();
    }
}
