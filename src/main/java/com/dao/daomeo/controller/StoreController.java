package com.dao.daomeo.controller;

import java.util.List;

import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.daomeo.entity.Store;
import com.dao.daomeo.service.StoreserService;

@Controller
public class StoreController {
	@Autowired
	private StoreserService userService;
	
	
	@RequestMapping(value = "/inputPage")
	public String inputPage() {
		return "input";
		
	}
	
	//提交
	@RequestMapping(value = "/saveUser")
	public String userPage(Store user) {
		this.userService.insertUser(user);
		return "ok";
	}
	
	/**
	 * 查询所有列表
	 */
	@RequestMapping(value = "/userlist")
	public String userlist(Model model) {
		List<Store> userList = this.userService.selectUserList();
		model.addAttribute("userList", userList);
		return "userList";
	}
	@RequestMapping(value = "/input")
	public String getoinput() {
		return "input";
	}
	
	/**
	 * 根据id查询修改 的内容
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getUserById")
	public String getUseryById(Integer id,Model model) {
		Store user = this.userService.getUserById(id);
		model.addAttribute("user", user);	
		return "updateUser";
		
	}
	/**
	 * 修改完后并且提交
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/editUser")
	public String editUser(Store user) {
		user.getId();
		this.userService.updateUser(user);
		return "ok2";
		
	}

}
