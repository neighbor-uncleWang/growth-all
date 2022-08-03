package com.wjw.cloud.gportal.sentinel;

import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.degrade.circuitbreaker.CircuitBreakerStrategy;
import com.google.common.collect.Lists;

/**
 * @author laoWang
 * @ClassName DegradeRuleExample.java
 * @createTime 2022-08-03 20:21
 */
public class DegradeRuleExample {

    public void init() {
        DegradeRule rule = new DegradeRule("resourceKey")
                .setGrade(CircuitBreakerStrategy.SLOW_REQUEST_RATIO.getType())
                // Max allowed response time
                .setCount(3000)
                // Retry timeout (in second)
                .setTimeWindow(5)
                // Circuit breaker opens when slow request ratio > 20%
                .setSlowRatioThreshold(0.2)
                .setMinRequestAmount(10)
                .setStatIntervalMs(60000);

        DegradeRuleManager.loadRules(Lists.newArrayList(rule));
    }


}
