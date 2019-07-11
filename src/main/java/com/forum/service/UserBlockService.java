package com.forum.service;

import java.util.List;

import com.forum.bean.UserBlock;

public interface UserBlockService {
	public List<UserBlock> followingBlock(int studeid);//根据学号查找用户关注的所有版块
	public void addFollowingBlock(int studeid,String blockName);//增加用户关注的版块
	public void cutFollowingBlock(int studeid,String blockName);//减少用户关注的版块
	public UserBlock selUserBlock(int studeid,String blockName);//根据版块的uuid和用户学号查找用户是否关注过对应版块
}
