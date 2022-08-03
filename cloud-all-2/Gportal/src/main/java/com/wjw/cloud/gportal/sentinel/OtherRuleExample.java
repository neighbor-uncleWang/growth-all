package com.wjw.cloud.gportal.sentinel;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.context.ContextUtil;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
import java.util.List;

/**
 * 基于调用关系的流量控制
 * <p>
 * 失效原因：可能会和spi的扩展点设置的流控规则冲突
 *
 *
 * @author laoWang
 * @ClassName OtherRuleExample.java
 * @createTime 2022-08-03 20:15
 */
public class OtherRuleExample {

    public static void main(String[] args) {
        init();
        for (int i = 0; i < 10; i++) {
            ContextUtil.enter("context", "caller");
            //声明当前的调用方的应用名称， 通过origin参数
            try (Entry entry = SphU.entry("hello")) {
                System.out.println("访问成功");
            } catch (BlockException e) {
                System.out.println("被限流了");
            } catch (Exception e) {
                System.out.println("被限流了===Exception");
            }
        }

        System.out.println("===============");
    }


    private static void init() {
        List<FlowRule> rules = new ArrayList<>();

        FlowRule rule = new FlowRule();
        rule.setResource("hello");
        rule.setCount(1);
        //配置caller为调用者
        rule.setLimitApp("caller");

        FlowRule rule1 = new FlowRule();
        rule1.setResource("hello");
        rule1.setCount(1);
        //配置other
        rule1.setLimitApp("other");

        rules.add(rule);
        rules.add(rule1);
        FlowRuleManager.loadRules(rules);
    }


}
