package com.dao.daomeo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.daomeo.dao.StoreMapper;
import com.dao.daomeo.entity.Store;
import com.dao.daomeo.service.StoreserService;
@Transactional
@Service
public class StoreServiceImpl implements StoreserService{
	
	@Autowired 
	private StoreMapper userMapper;
	@Override
	public void insertUser(Store user) {
		this.userMapper.insertUser(user);
		
		
	}

	@Override
	public List<Store> selectUserList() {
		List<Store> selectUserList = this.userMapper.selectUserList();
		return selectUserList;
	}

	@Override
	public Store getUserById(Integer id) {
		
		return this.userMapper.getUserById(id);
	}

	@Override
	public void updateUser(Store user) {
		
		this.userMapper.updateUser(user);
		
	}

	@Override
	public void delteUserById(Integer id) {
		this.userMapper.delteUserById(id);
		
	}

}
