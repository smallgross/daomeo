package com.dao.daomeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;

import com.dao.daomeo.service.UserServerice;


@Configuration
@EnableWebSecurity //开启Spring Security
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启权限注解 例如：@PreAuthorize注解

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	
	
	@Autowired
	private UserServerice userServerice;
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //使用自定义身份认证组件
        auth.authenticationProvider(new JwtAuthenticationProvider(userServerice));
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//禁用csrf，由于使用的是jwt，我们这里不需要csrf
		http.cors().and().csrf().disable().authorizeRequests()
		//跨域预检请求
		.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
		//webjars
		.antMatchers("/webjars/**").permitAll()
		///druid监控sql
		.antMatchers("/druid/**").permitAll()
		//首页登录页面
		.antMatchers("/").permitAll().antMatchers("/login").permitAll()
		//wsager
		
		.antMatchers("/swagger-ui.html").permitAll()
		.antMatchers("/swagger-resources/**").permitAll()
		
		//其他所有请求需要身份验证
		.anyRequest().authenticated();
		//退出登录处理器
		
		http.logout().logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler());
		
		//token验证过滤器
		http.addFilterBefore(new JwtAuthenticationFilter(authenticationManager())
		,UsernamePasswordAuthenticationFilter.class);
	}
	
	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManager();
	}
}
