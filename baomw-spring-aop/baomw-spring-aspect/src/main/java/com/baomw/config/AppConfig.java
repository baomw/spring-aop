package com.baomw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.baomw")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AppConfig {

}
