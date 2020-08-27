package com.dao.daomeo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.dao.daomeo.entity.User;

@Mapper
public interface UserMapper {

	/**
	 * 查询
	 * @return
	 */
	@Select("select *from user where username=#{username}and password=#{password}")
	List<Map<String, Object>>query(@Param("username")String username,@Param("password")String password);
	
	
	
	/**
	 * 注册
	 */
	@Select("insert into user(username,password)values(#{username},#{password})")
	public List<Map<String, Object>>add(@Param("username")String username,@Param("password")String password);

	
	
	//https://www.cnblogs.com/s313139232/p/10549601.html实例
	
}
