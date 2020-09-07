package com.dao.daomeo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

import org.springframework.security.core.context.SecurityContextHolder;
/**
 * 获取令牌进行认证
 * @author luo
 *
 */
public class SecurityUtils {

	

	public static void checkAuthentication(HttpServletRequest request) {
		//获取令牌并根据令牌登录认证信息
		
		Authentication authentication=JwtTokenUtils.getAuthenticaionFromToken(request);
		
	
		//设置登录认证信息上下文
		SecurityContextHolder.getContext().setAuthentication(authentication);
	}

}
