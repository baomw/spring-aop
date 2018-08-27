package com.baomw.util;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 流程审批操作
 *
 * @author baomw
 * @create 2018-08-26 下午 2:28
 */
@Service
public class FlowUtilService {

    /**
     * 提交操作
     * @return
     */
    public void doSubmit(HashMap map){
        System.out.println("提交处理中");
    }

    /**
     * 审批操作
     * @param map
     * @return
     */
    public Map doAudit(HashMap map){
        System.out.println("审批处理中");
        return null;
    }
}
