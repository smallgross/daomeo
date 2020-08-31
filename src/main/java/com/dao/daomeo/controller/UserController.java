package com.dao.daomeo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.daomeo.service.UserServerice;

@Controller
public class UserController {
	@Autowired
	UserServerice userServerice;
	
	@RequestMapping("/logn")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginsuc")
	@ResponseBody
	public String loginsuc(String username,String password) {
		System.out.println(username);
		System.out.println(userServerice.query(username, password));
		List<Map<String,Object>> query = userServerice.query(username, password);
			if(query != null && query.size() >0) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("success", "success");
				return "success";
			}
			return "";
		
	}
	
	@RequestMapping(value = "/show")
	public String show() {
		return "show";
		
	}
	@RequestMapping(value ="/show2")
	public String show1() {
		return "show2";
		
	}
	@RequestMapping(value = "/inde")
	public String index() {
		return "inde";
		
	}
}
