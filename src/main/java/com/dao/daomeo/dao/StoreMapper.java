package com.dao.daomeo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dao.daomeo.entity.Store;
@Mapper
public interface StoreMapper {
	
	void insertUser(Store user);

	List<Store> selectUserList();

	Store getUserById(Integer id);

	void updateUser(Store user);

	void delteUserById(Integer id);

}
