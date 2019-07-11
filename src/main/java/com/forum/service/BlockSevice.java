package com.forum.service;

import java.util.List;

import com.forum.bean.Block;

public interface BlockSevice {
	public List<Block> selAllBlock();//查找所有版块信息
	public Block selBlockByUuid(String uuid);//根据uuid查找某一版块信息
	public Block selBlockByName(String name);//根据版块名称查找某一版块信息
	public void addFocus(String uuid);//根据uuid增加对应版块关注量
	public void cutFocus(String uuid);//根据uuid减少对应版块关注量
	public void addNum(String uuid);//根据uuid增加对应版块发帖量量
	public void cutNum(String uuid);//根据uuid减少对应版块关发帖量
}
