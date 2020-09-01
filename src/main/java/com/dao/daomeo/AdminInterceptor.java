//package com.dao.daomeo;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import com.dao.daomeo.entity.User;
//
///**
// * 拦截器
// * @author luo
// *
// */
//@Configuration
//public class AdminInterceptor implements HandlerInterceptor {
//	
//	/**
//	 *  在请求处理之前进行调用（Controller方法调用之前）
//	 */
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		 //统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session)
//	
//			HttpSession session = request.getSession();
//			User user = (User) session.getAttribute("user");
//
//	        //如果session中没有user，表示没登陆
//			if (user ==null) {
//				//这个方法返回false表示忽略当前请求，如果一个用户调用了需要登陆才能使用的接口，如果他没有登陆这里会直接忽略掉
//	            //当然你可以利用response给用户返回一些提示信息，告诉他没登陆
//				return false;
//			}else {
//				 return true;//如果session里有user，表示该用户已经登陆，放行，用户即可继续调用自己需要的接口
//			}
//				
//				
//			
//		
//			
//		 
//	}
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//		
//	}
//
//}
