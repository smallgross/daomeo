package com.dao.daomeo.service;

import java.util.List;

import com.dao.daomeo.entity.User;
import com.dao.daomeo.result.Result;

public interface UserServerice {
	/**
	 * 增加
	 * @param user
	 */
	void insertUser(User user);
	/**
	 * 查询
	 * @return
	 */
	Result<User> seleByIdUserList();
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
