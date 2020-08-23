package com.dao.daomeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.daomeo.entity.Add;
import com.dao.daomeo.service.AddService;

@Controller
public class Addcontroller {
	
	@Autowired
	private AddService addService;
	
	
	//展示提交表单页面
	
	@RequestMapping("/insert")
	public String insert() {
		return "input";
	}
	
	@RequestMapping("/saveAdd")
	public String userPage(Add add) {
		this.addService.insert(add);
		return "ok";
		
	}
	
	
	

}
