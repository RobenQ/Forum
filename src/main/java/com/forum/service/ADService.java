package com.forum.service;

import java.util.List;

import com.forum.bean.AD;

public interface ADService {
	public List<AD> selAll();
	public AD selByUuid(String uuid);
	public void addWatched(String uuid);
}
