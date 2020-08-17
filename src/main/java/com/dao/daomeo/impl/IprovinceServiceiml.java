package com.dao.daomeo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.daomeo.dao.provinceMapper;
import com.dao.daomeo.entity.Province;
import com.dao.daomeo.service.IprovinceService;
/**
 * 实现类
 * @author luo
 *
 */
@Service
public class IprovinceServiceiml implements IprovinceService {
@Autowired
provinceMapper provinceMapper;
	@Override
	public List<Province> selectAll() {
		
		return this.provinceMapper.selectAll();
	}

}
