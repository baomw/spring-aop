package com.baomw.service;

import com.baomw.event.AbstractActivitiEvnet;
import org.aspectj.lang.annotation.Before;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 测试流程1
 *
 * @author baomw
 * @create 2018-08-26 下午 1:58
 */
public class TestFlow1 extends AbstractActivitiEvnet {

    public void filterRouteList(List routeList, Map inputData) {
        System.out.println("测试流程1-----路径过滤处理中。。。");
        System.out.println();
    }
    @Before("execution(* (com.baomw.util.FlowUtilService.doSubmit(Map map)))")
    public Map beforeSubmit(Map inputData) {
        System.out.println("测试流程1-----提交前在操作中。。。");
        return null;
    }

    public Map afterSubmit(Map inputData) {
        System.out.println("测试流程1-----提交后在操作中。。。");
        return null;
    }

    public Map beforeAudit(Map inputData) {
        System.out.println("测试流程1-----审批前在操作中。。。");
        return null;
    }

    public Map afterAudit(Map inputData) {
        System.out.println("测试流程1-----审批后在操作中。。。");
        return null;
    }
}
