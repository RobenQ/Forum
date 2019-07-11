package com.forum.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.forum.bean.User;

@Component
/**
 * Mybatis用户mapper接口
 * @author Coding
 *
 */
public interface UserMapper {
	public User login(@Param("name")String name,@Param("password")String password);
}
