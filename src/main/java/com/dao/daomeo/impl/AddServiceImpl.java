package com.dao.daomeo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.daomeo.dao.AddMapper;
import com.dao.daomeo.entity.Add;
import com.dao.daomeo.service.AddService;

@Service
public class AddServiceImpl implements AddService {

	@Autowired
	private AddMapper addMapper;
	@Override
	public void insert(Add add) {
		addMapper.insert(add);
		
	}

	@Override
	public List<Add> selectAll() {
		
		return addMapper.selectAll();
	}

}
