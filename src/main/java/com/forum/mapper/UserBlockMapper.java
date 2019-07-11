package com.forum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.forum.bean.UserBlock;

@Component
public interface UserBlockMapper {
	public List<UserBlock> followingBlock(@Param("studeid")int studeid);
	public void addFollowingBlock(@Param("studeid")int studeid,@Param("blockName")String blockName);
	public void cutFollowingBlock(@Param("studeid")int studeid,@Param("blockName")String blockName);
	public UserBlock selUserBlock(@Param("studeid")int studeid,@Param("blockName")String blockName);
}
