package com.forum.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.forum.bean.Praise;

@Component
public interface PraiseMapper {
	public Praise selByPostUuid(@Param("belong")String belong,@Param("uuid")String uuid);
	
	public Praise selByReplyUuid(@Param("belong")String belong,@Param("uuid")String uuid);
	
	public void praisePost(@Param("belong")String belong, @Param("postUuid")String postUuid, @Param("replyUuid")String replyUuid,
			@Param("statusPost")boolean statusPost, @Param("statusReply")boolean statusReply);
	
	public void praiseReply(@Param("belong")String belong, @Param("postUuid")String postUuid, @Param("replyUuid")String replyUuid,
			@Param("statusPost")boolean statusPost, @Param("statusReply")boolean statusReply);
	
	public void updatePostPraise(@Param("belong")String belong, @Param("postUuid")String postUuid);
	
	public void updateReplyPraise(@Param("belong")String belong, @Param("replyUuid")String replyUuid);
}
