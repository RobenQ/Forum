package com.forum.service;

import java.sql.Timestamp;
import java.util.List;

import com.forum.bean.Post;

public interface PostService {
	public List<Post> selAllPost();//查找所有帖子的信息
	public List<Post> selAllByBlock(String block);//根据版块名称查找对应板块的所有帖子
	public void newPost(String belong, Timestamp sendTime, int watched, int praise, int reply, String title, String block,
			String type, String fujian, String context,String uuid);//发表新帖到某一版块
	public Post selPostByUUID(String uuid);//根据uuid查找某一帖子的信息
	public void updateWatched(String uuid);//根据uuid增加对应帖子的浏览量
	public void updatePraise(String uuid);//根据uuid增加对应帖子的获得的点赞量
	public void updateReply(String uuid);//根据uuid增加对应帖子的回复量
}
