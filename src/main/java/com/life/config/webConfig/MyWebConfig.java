package com.life.config.webConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 跳转至登录页
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");

        //todo:测试，待删除
//        registry.addViewController("/index").setViewName("index");
    }

    // 配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).
                addPathPatterns("/**").
                excludePathPatterns(
                        "/", "/login", "/userlogin", "/css/**", "/data/**", "/fonts/**", "/icons-reference/**", "/js/**", "/img/**", "/vendor/**"
                );
    }

}
