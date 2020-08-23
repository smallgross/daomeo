package com.dao.daomeo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dao.daomeo.entity.User;
@Mapper
public interface UserMapper {
	
	void insertUser(User user);

	List<User> selectUserList();

	User getUserById(Integer id);

	void updateUser(User user);

	void delteUserById(Integer id);

}
