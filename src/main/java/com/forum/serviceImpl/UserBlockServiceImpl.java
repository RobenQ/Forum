package com.forum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.bean.UserBlock;
import com.forum.mapper.UserBlockMapper;
import com.forum.service.UserBlockService;

@Service
public class UserBlockServiceImpl implements UserBlockService{
	
	@Autowired
	private UserBlockMapper userBlockMapper;
	
	public List<UserBlock> followingBlock(int studeid) {
		return userBlockMapper.followingBlock(studeid);
	}
	
	public void addFollowingBlock(int studeid, String blockName) {
		userBlockMapper.addFollowingBlock(studeid, blockName);
	}
	
	public void cutFollowingBlock(int studeid, String blockName) {
		userBlockMapper.cutFollowingBlock(studeid, blockName);
	}
	
	public UserBlock selUserBlock(int studeid, String blockName) {
		return userBlockMapper.selUserBlock(studeid, blockName);
	}
}
