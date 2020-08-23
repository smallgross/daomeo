package com.dao.daomeo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.daomeo.dao.UserMapper;
import com.dao.daomeo.entity.User;
import com.dao.daomeo.service.UserService;
@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired 
	private UserMapper userMapper;
	@Override
	public void insertUser(User user) {
		this.userMapper.insertUser(user);
		
		
	}

	@Override
	public List<User> selectUserList() {
		List<User> selectUserList = this.userMapper.selectUserList();
		return selectUserList;
	}

	@Override
	public User getUserById(Integer id) {
		
		return this.userMapper.getUserById(id);
	}

	@Override
	public void updateUser(User user) {
		this.userMapper.updateUser(user);
		
	}

	@Override
	public void delteUserById(Integer id) {
		this.userMapper.delteUserById(id);
		
	}

}
