package com.wjw.cloud.user.sentinel;

import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
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
        List<FlowRule> rules=new ArrayList<>();
        FlowRule rule=new FlowRule();
        rule.setResource("com.wjw.cloud.service.IUserService:say()");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(2);
        rules.add(rule);

        FlowRuleManager.loadRules(rules);
    }


}
