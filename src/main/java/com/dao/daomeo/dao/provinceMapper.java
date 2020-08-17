package com.dao.daomeo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dao.daomeo.entity.Province;
/**
 * 映射xml上的数据
 * @author luo
 *
 */
@Mapper
public interface provinceMapper {
	public List<Province>selectAll();
	

}
