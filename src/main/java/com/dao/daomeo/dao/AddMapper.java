package com.dao.daomeo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dao.daomeo.entity.Add;

/**
 * 映射xml上
 * @author luo
 *
 */
@Mapper
public interface AddMapper {

	//增加
	public void insert(Add add);
	//查询
	public  List<Add>selectAll();
	
	//修改
	public void updateAdd(Add add);
	
	//删除
	public void delteAddById(Integer id);
}
