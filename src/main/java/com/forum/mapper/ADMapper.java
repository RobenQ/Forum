package com.forum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.forum.bean.AD;

@Component
public interface ADMapper {
	public List<AD> selAll();
	public AD selByUuid(@Param("uuid")String uuid);
	public void addWatched(@Param("uuid")String uuid);
}
