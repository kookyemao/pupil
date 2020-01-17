//package com.example.oraclemybatis.util;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//public class WebMvcConfig extends WebMvcConfigurerAdapter {
//        //Java代码中覆盖默认静态资源配置
//    @Override    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        if(!registry.hasMappingForPattern("/static/**")){
//            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        }
//        super.addResourceHandlers(registry);
//    }
//
//}
