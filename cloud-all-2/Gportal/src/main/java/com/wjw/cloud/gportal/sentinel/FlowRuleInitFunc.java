package com.wjw.cloud.gportal.sentinel;

import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author laoWang
 * @ClassName FlowRuleInitFunc.java
 * @createTime 2022-08-01 22:01
 */
public class FlowRuleInitFunc implements InitFunc {

    @Override
    public void init() throws Exception {
        flowRule();
    }

    private static void flowRule(){
        List<FlowRule> ruleList = Lists.newArrayList();
        FlowRule rule = new FlowRule();
        rule.setRefResource("test01");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(2);
        ruleList.add(rule);

        FlowRuleManager.loadRules(ruleList);
    }


}
