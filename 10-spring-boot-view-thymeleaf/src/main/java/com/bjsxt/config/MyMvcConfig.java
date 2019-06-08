package com.bjsxt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 自定义Mvc配置，跟SpringBoot默认配置共存
 *
 * Created by lwx on 2019/6/8.
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送 /user 请求转发到 sucess.html
        registry.addViewController("/user").setViewName("sucess");
    }
}
