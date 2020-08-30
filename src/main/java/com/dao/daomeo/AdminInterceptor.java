package com.dao.daomeo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.dao.daomeo.entity.User;

/**
 * 拦截器
 * @author luo
 *
 */
public class AdminInterceptor implements HandlerInterceptor {
	
	/**
	 *  在请求处理之前进行调用（Controller方法调用之前）
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		 //统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session)
		try {
			User user = (User) request.getSession().getAttribute("user");
			if (user!=null) {
				return true;
				
			}
			response.sendRedirect(request.getContextPath()+"登录页面");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;//如果设置为false时，被请求时，拦截器执行到此处将不会继续操作
        //如果设置为true时，请求将会继续执行后面的操作
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
