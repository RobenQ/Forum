package com.forum.service;

import java.sql.Timestamp;
import java.util.List;

import com.forum.bean.Reply;

public interface ReplyService {
	public List<Reply> selReplyByUuid(String uuid);//根据帖子的uuid查找对应帖子的所有回复信息
	public void newReply(String belong, Timestamp sendTime, String context, String uuid, int watched, int reply, int praise,
			String myUuid);//对帖子进行回复
}