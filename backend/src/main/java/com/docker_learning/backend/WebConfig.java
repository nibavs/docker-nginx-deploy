//package com.docker_learning.backend;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:3000")
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                .allowedHeaders("*")
//                .allowCredentials(true);
//    }
//
////    @Override
////    public void addViewControllers(ViewControllerRegistry registry) {
//////        registry.addViewController("/login").setViewName("login");
////        registry.addViewController("/home").setViewName("home");
//////        registry.addViewController("/hello").setViewName("hello");
////    }
//}
