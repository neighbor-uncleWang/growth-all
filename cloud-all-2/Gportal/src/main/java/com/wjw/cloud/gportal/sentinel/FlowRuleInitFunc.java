package com.wjw.cloud.gportal.sentinel;

import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.google.common.collect.Lists;

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

    private static void flowRule() {

        List<FlowRule> ruleList = new ArrayList<>();
        FlowRule rule01 = new FlowRule();
        rule01.setResource("test01");
        //限流方式qps
        rule01.setGrade(RuleConstant.FLOW_GRADE_QPS);
        //拒绝策略;QPS达到阈值之后的处理方式;默认直接拒绝
        rule01.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT);
        //限流大小
        rule01.setCount(2);


        //dubbo的限流
        FlowRule rule02 = new FlowRule();
        //粗粒度 应用维度
        rule02.setResource("com.wjw.cloud.service.IUserService");
        //细粒度 接口维度
//        rule02.setResource("com.wjw.cloud.service.IUserService:say()");
        rule02.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule02.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT);
        rule02.setCount(2);


        ruleList.add(rule01);
        ruleList.add(rule02);
        FlowRuleManager.loadRules(ruleList);
    }


}
