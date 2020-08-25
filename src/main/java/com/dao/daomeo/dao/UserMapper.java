package com.dao.daomeo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dao.daomeo.entity.User;

@Mapper
public interface UserMapper {
	/**
	 * 增加
	 * @param user
	 */
	void insertUser(User user);
	/**
	 * 查询
	 * @return
	 */
	List<User>seleByIdUserList();
	/**
	 * 根据id查询
	 * @param user
	 * @return
	 */
	
	User getUserById(Integer id);
	
	/**
	 * 修改
	 */
	void updateUser(User user);
	
	/**
	 * 删除
	 */
	void delteUserById(Integer id);
	
}
