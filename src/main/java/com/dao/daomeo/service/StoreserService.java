package com.dao.daomeo.service;

import java.util.List;

import com.dao.daomeo.entity.Store;

public interface StoreserService {
	void insertUser(Store user);

	List<Store> selectUserList();

	Store getUserById(Integer id);

	void updateUser(Store user);

	void delteUserById(Integer id);
}
