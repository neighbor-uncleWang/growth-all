/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.wjw.cloud.gportal.sentinel;

import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author wjw01019072
 * @version : SentinelExample.java, v 0.1 2022年07月29日 14:26 wjw01019072 Exp $
 */
public class SentinelExample {

    private final static String RESOURCE = "SentinelExample";

    public static void main(String[] args) throws BlockException {

        while (true){
            SphU.entry(RESOURCE);

            System.out.println("Request Success");
        }

    }



}