package com.baomw.service;

import com.baomw.event.AbstractActivitiEvnet;
import org.aspectj.lang.annotation.Before;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 测试流程2
 *
 * @author baomw
 * @create 2018-08-26 下午 1:58
 */
public class TestFlow2 extends AbstractActivitiEvnet {

    public void filterRouteList(List routeList, Map inputData) {
        System.out.println("测试流程2-----路径过滤处理中。。。");
    }

    @Before("execution(* (com.baomw.util.FlowUtilService.doSubmit(Map map)))")
    public Map beforeSubmit(Map inputData) {
        System.out.println("测试流程2-----提交前在操作中。。。");
        return null;
    }

    public Map afterSubmit(Map inputData) {
        System.out.println("测试流程2-----提交后在操作中。。。");
        return null;
    }

    public Map beforeAudit(Map inputData) {
        System.out.println("测试流程2-----审批前在操作中。。。");
        return null;
    }

    public Map afterAudit(Map inputData) {
        System.out.println("测试流程2-----审批后在操作中。。。");
        return null;
    }
}
