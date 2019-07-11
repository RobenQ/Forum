package com.forum.serviceImpl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.bean.Reply;
import com.forum.mapper.ReplyMapper;
import com.forum.service.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyMapper replyMapper;
	
	public List<Reply> selReplyByUuid(String uuid) {
		return replyMapper.selReplyByUuid(uuid);
	}

	public void newReply(String belong, Timestamp sendTime, String context, String uuid, int watched, int reply,
			int praise, String myUuid) {
		replyMapper.newReply(belong, sendTime, context, uuid, watched, reply, praise, myUuid);
	}

}
