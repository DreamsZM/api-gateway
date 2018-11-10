package com.zy.apigateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Component;

/**
 * 实现zuul配置的动态更新
 */
@Component
public class ZuulConfig {

    @ConfigurationProperties
    @RefreshScope
    public ZuulProperties zuulProperties(){
        return new ZuulProperties;
    }
}
