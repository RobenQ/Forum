package com.forum.mapper;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.forum.bean.Reply;

@Component
public interface ReplyMapper {
	public List<Reply> selReplyByUuid(@Param("uuid")String uuid);
	public void newReply(@Param("belong")String belong, @Param("sendTime")Timestamp sendTime, @Param("context")String context,
			@Param("uuid")String uuid, @Param("watched")int watched, @Param("reply")int reply, @Param("praise")int praise,
			@Param("myUuid")String myUuid);
}
