package com.forum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.bean.AD;
import com.forum.mapper.ADMapper;
import com.forum.service.ADService;

@Service
public class ADServiceImpl implements ADService{

	@Autowired
	private ADMapper adMapper;

	public List<AD> selAll() {
		return adMapper.selAll();
	}

	public AD selByUuid(String uuid) {
		return adMapper.selByUuid(uuid);
	}

	public void addWatched(String uuid) {
		adMapper.addWatched(uuid);
	}
	
}
