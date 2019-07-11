package com.forum.service;

import com.forum.bean.Praise;

public interface PraiseService {
	public Praise selByPostUuid(String belong,String uuid);//根据用户名和帖子的uuid查找用户是否存在给某一帖子点过赞
	public Praise selByReplyUuid(String belong,String uuid);//根据用户名和回复的uuid查找用户是否存在给某一帖子点过赞
	public void praisePost(String belong, String postUuid, String replyUuid, boolean statusPost, boolean statusReply);//给帖子点赞
	public void praiseReply(String belong, String postUuid, String replyUuid, boolean statusPost, boolean statusReply);//给帖子的回复点赞
	public void updatePostPraise(String belong, String postUuid);//更新持久层信息
	public void updateReplyPraise(String belong, String postUuid);//更新持久层信息
}
