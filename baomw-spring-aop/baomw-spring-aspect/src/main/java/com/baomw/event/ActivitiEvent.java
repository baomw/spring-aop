package com.baomw.event;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 流程审批事件接口
 *
 * @author baomw
 * @create 2018-08-26 下午 1:41
 */
public interface ActivitiEvent {

    /**
     * @param routeList
     * @param inputData
     */
    public void filterRouteList(List routeList, Map inputData) ;

    /**
     * @param inputData
     * @return
     */
    public Map beforeSubmit(Map inputData);

    /**
     * @param inputData
     * @return
     */
    public Map afterSubmit(Map inputData);

    /**
     * @param inputData
     * @return
     */
    public Map beforeAudit(Map inputData);

    /**
     * @param inputData
     * @return
     */
    public Map afterAudit(Map inputData);

}
