package com.forum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.forum.bean.Block;

@Component
public interface BlockMapper {
	public List<Block> selAllBlock();
	public Block selBlockByUuid(@Param("uuid")String uuid);
	public Block selBlockByName(@Param("name")String name);
	public void addFocus(@Param("uuid")String uuid);
	public void cutFocus(@Param("uuid")String uuid);
	public void addNum(@Param("uuid")String uuid);
	public void cutNum(@Param("uuid")String uuid);
}
