package com.baomw.test;

import com.baomw.config.AppConfig;
import com.baomw.util.FlowUtilService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("message","我是爸爸...");
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
       /* Memberdao memberdao = ac.getBean(Memberdao.class);
        memberdao.query();*/

        FlowUtilService service = ac.getBean(FlowUtilService.class);
        service.doSubmit((HashMap) map);
    }
}
