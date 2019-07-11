package com.forum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.bean.Block;
import com.forum.mapper.BlockMapper;
import com.forum.service.BlockSevice;

@Service
public class BlockServiceImpl implements BlockSevice{

	@Autowired
	private BlockMapper blockMapper;
	
	public List<Block> selAllBlock() {
		return blockMapper.selAllBlock();
	}

	public Block selBlockByUuid(String uuid) {
		return blockMapper.selBlockByUuid(uuid);
	}
	
	public Block selBlockByName(String name) {
		return blockMapper.selBlockByName(name);
	}

	public void addFocus(String uuid) {
		blockMapper.addFocus(uuid);
	}
	
	public void cutFocus(String uuid) {
		blockMapper.cutFocus(uuid);
	}

	public void addNum(String uuid) {
		blockMapper.addNum(uuid);
	}

	public void cutNum(String uuid) {
		blockMapper.cutNum(uuid);
	}
}
