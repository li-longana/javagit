package com.aop.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.aop")
//启动aop注解开发
@EnableAspectJAutoProxy
//引入第三方bean配置
@Import({jdbcconfig.class, MyBatisConfig.class})
//加载资源文件，数据
@PropertySource({"classpath:jdbc.properties"})
@EnableTransactionManagement
public class SpringConfig {
}
