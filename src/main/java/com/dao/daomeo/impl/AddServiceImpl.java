package com.dao.daomeo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.daomeo.dao.AddMapper;
import com.dao.daomeo.entity.Add;
import com.dao.daomeo.service.AddService;
@Transactional
@Service
public class AddServiceImpl implements AddService {

	@Autowired
	private AddMapper addMapper;
	
	/**
	 * 增加
	 */
	@Override
	public void insert(Add add) {
		this.addMapper.insert(add);
		
	}
	/**
	 * 查询
	 */

	@Override
	public List<Add> selectAll() {
		
		return this.addMapper.selectAll();
	}
	/**
	 * 修改
	 */

	@Override
	public void updateAdd(Add add) {
		this.addMapper.updateAdd(add);
		
	}
/**
 * 删除
 */
	@Override
	public void delteAddById(Integer id) {
		this.addMapper.delteAddById(id);
		
	}

}
