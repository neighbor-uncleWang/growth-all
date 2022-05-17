package com.wjw.all.springbootall.test;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ResourceLoader;

/**
 * spring 的配置文件解析
 * 等价于：@PropertySource( value = "classpath:application.properties")
 *
 * @author laoWang
 * @ClassName BeanConfig.java
 * @createTime 2022-05-17 22:26
 */
public class BeanConfig implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Bean
    public PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new
                PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setLocation(resourceLoader.getResource("application.properties"));
        return propertySourcesPlaceholderConfigurer;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

}
