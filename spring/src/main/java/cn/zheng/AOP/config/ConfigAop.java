package cn.zheng.AOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"cn.zheng.AOP"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
