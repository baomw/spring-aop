package com.baomw.event;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 流程审批通知接口抽象实现
 *
 * @author baomw
 * @create 2018-08-26 下午 2:46
 */
@Aspect
@Component
public class AbstractActivitiEvnet implements ActivitiEvent{

    @Pointcut("execution(* com.baomw.util.FlowUtilService.doSubmit(..))&& args(inputData)")
    public void submitPointCut(Map inputData){

    }
    @Pointcut("execution(* com.baomw.util.FlowUtilService.doAudit(..))&& args(inputData)")
    public void auditPointCut(Map inputData){

    }

    public void filterRouteList(List routeList, Map inputData) {

    }
    @Before("submitPointCut(inputData)")
    public Map beforeSubmit(Map inputData) {
        System.out.println(inputData.get("message"));
        inputData.put("message","我是爷爷。。。");
        return null;
    }
    @AfterReturning("submitPointCut(inputData)")
    public Map afterSubmit(Map inputData) {
        System.out.println(inputData.get("message"));
        return null;
    }

    public Map beforeAudit(Map inputData) {
        return null;
    }

    public Map afterAudit(Map inputData) {
        return null;
    }
}
