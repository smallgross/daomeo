package com.dao.daomeo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.daomeo.entity.User;
import com.dao.daomeo.service.UserServerice;

@Controller
@RequestMapping("/login")
public class UserController {
	@Autowired
	UserServerice userServerice;
	
	@RequestMapping("/to_logn")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginsuc")
    @ResponseBody
	public String loginsuc(HttpServletRequest request ,HttpServletResponse response,
			HttpSession session,Model model) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user= userServerice.query(username, password);
		if (user!=null) {
			session.setAttribute("user", user);
			
		}
				return "login";

		
	}
	
	
		

	@RequestMapping(value = "/inde")
	public String index() {
		return "inde";
		
	}
}
