package com.dao.daomeo;

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

	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//注册拦截器
		InterceptorRegistration registration = registry.addInterceptor(new AdminInterceptor());
		registration.addPathPatterns("/**");//所有路径都被拦截
		registration.excludePathPatterns("/logn",
				"/userlist",            //html静态资源
                "/inputPage",              //js静态资源
                "/saveUser",             //css静态资源
                "/index",
                "/getdata"
                );    
	}
}
