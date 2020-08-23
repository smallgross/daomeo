package com.dao.daomeo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dao.daomeo.entity.Add;

/**
 * 实体类
 * @author luo
 *
 */
@Service
public interface AddService {
	//增加
		public void insert(Add add);
		//查询
		public  List<Add>selectAll();
		
		//修改
		public void updateAdd(Add add);
		
		//删除
		public void delteAddById(Integer id);

}
