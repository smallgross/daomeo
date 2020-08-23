package com.dao.daomeo.service;

import java.util.List;

import com.dao.daomeo.entity.User;

public interface UserService {
	void insertUser(User user);

	List<User> selectUserList();

	User getUserById(Integer id);

	void updateUser(User user);

	void delteUserById(Integer id);
}
