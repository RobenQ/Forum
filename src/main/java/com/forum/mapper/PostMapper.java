package com.forum.mapper;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.forum.bean.Post;

@Component
public interface PostMapper {
	public List<Post> selAllPost();
	public List<Post> selAllByBlock(@Param("block")String block);
	public void newPost(@Param("belong")String belong, @Param("sendTime")Timestamp sendTime, @Param("watched")int watched, 
			@Param("praise")int praise, @Param("reply")int reply, @Param("title")String title, @Param("block")String block,
			@Param("type")String type, @Param("fujian")String fujian, @Param("context")String context, @Param("uuid")String uuid);
	public Post selPostByUUID(@Param("uuid")String uuid);
	public void updateWatched(@Param("uuid")String uuid);
	public void updatePraise(@Param("uuid")String uuid);
	public void updateReply(@Param("uuid")String uuid);
}
