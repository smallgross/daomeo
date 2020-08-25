package com.dao.daomeo.controller;

import java.util.List;

import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.daomeo.entity.User;
import com.dao.daomeo.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/inputPage")
	public String inputPage() {
		return "input";
		
	}
	
	//提交
	@RequestMapping(value = "/saveUser")
	public String userPage(User user) {
		this.userService.insertUser(user);
		return "ok";
	}
	
	/**
	 * 查询所有列表
	 */
	@RequestMapping(value = "/userlist")
	public String userlist(Model model) {
		List<User> userList = this.userService.selectUserList();
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
		User user = this.userService.getUserById(id);
		model.addAttribute("user", user);	
		return "updateUser";
		
	}
	/**
	 * 修改完后并且提交
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/editUser")
	public String editUser(User user) {
		user.getId();
		this.userService.updateUser(user);
		return "ok2";
		
	}

}
