package com.dao.daomeo;

import javax.servlet.http.HttpServletRequest;


import org.springframework.security.core.Authentication;

/**
 * 根据请求令牌获取登录认证信息
 * @author luo
 *
 */

public class JwtTokenUtils {

	

	public static Authentication getAuthenticaionFromToken(HttpServletRequest request) {
		Authentication authentication=null;
		//获取请求令牌
	String token=	JwtTokenUtils.getToken(request);
		return null;
		
		
	}

	private static String getToken(HttpServletRequest request) {
		return null;
		// TODO Auto-generated method stub
		
	}

	
}
