package org.wjw.provider.dubbo.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 配置管理
 *
 * @author laoWang
 * @ClassName ProviderConfiguration.java
 * @createTime 2022-05-06 21:13
 */
@Configuration
@EnableDubbo(scanBasePackages = "org.wjw.provider.dubbo")
@PropertySource("classpath:/dubbo-provider.properties")
public class ProviderConfiguration {


}
