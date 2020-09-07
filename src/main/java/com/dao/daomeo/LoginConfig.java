package com.dao.daomeo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
/**
 * 拦截器配置
 * @author luo
 *
 */
@Configuration
public class LoginConfig extends WebMvcConfigurationSupport{
	
@Autowired
private AdminInterceptor adminInterceptor;

	@Override
		protected void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(adminInterceptor).addPathPatterns("/**")
			.excludePathPatterns("/logn");
			
		}
	
	@Override
		protected void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		}
	
	
	}
