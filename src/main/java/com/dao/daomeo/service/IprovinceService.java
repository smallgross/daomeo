package com.dao.daomeo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dao.daomeo.entity.Province;

/**
 * 实体类
 * @author luo
 *
 */
@Service
public interface IprovinceService {
	public List<Province>selectAll();

}
