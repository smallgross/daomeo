package com.dao.daomeo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.daomeo.dao.UserMapper;
import com.dao.daomeo.entity.User;
import com.dao.daomeo.result.Result;
@Service
public class UserServerice {
	
	@Autowired
	UserMapper userMapp;
	
	public User query(String username,String password){
		return userMapp.query(username, password);
		
	}
	public List<Map<String, Object>>add(String username,String password){
		return userMapp.add(username, password);
		
	}
}
