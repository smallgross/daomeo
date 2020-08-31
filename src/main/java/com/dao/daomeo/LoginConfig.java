package com.dao.daomeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 拦截器配置
 * @author luo
 *
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer{

	  @Autowired
	  private AdminInterceptor adminInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//注册拦截器
		InterceptorRegistration registration = registry.addInterceptor(adminInterceptor);
		registration.addPathPatterns("/**");//所有路径都被拦截
		registration.excludePathPatterns("/logn","/userlist");  
//		registry.addInterceptor(adminInterceptor).addPathPatterns("/**").excludePathPatterns("/logn","/userlist");
		
	}
}
