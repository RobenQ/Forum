package com.forum.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.bean.Praise;
import com.forum.mapper.PraiseMapper;
import com.forum.service.PraiseService;

@Service
public class PraiseServiceImpl implements PraiseService{

	@Autowired
	private PraiseMapper praiseMapper;
	
	public Praise selByPostUuid(String belong, String uuid) {
		return praiseMapper.selByPostUuid(belong, uuid);
	}

	public Praise selByReplyUuid(String belong, String uuid) {
		return praiseMapper.selByReplyUuid(belong, uuid);
	}

	public void praisePost(String belong, String postUuid, String replyUuid, boolean statusPost, boolean statusReply) {
		praiseMapper.praisePost(belong, postUuid, replyUuid, statusPost, statusReply);
	}

	public void praiseReply(String belong, String postUuid, String replyUuid, boolean statusPost, boolean statusReply) {
		praiseMapper.praiseReply(belong, postUuid, replyUuid, statusPost, statusReply);
	}

	public void updatePostPraise(String belong, String postUuid) {
		praiseMapper.updatePostPraise(belong, postUuid);
	}

	public void updateReplyPraise(String belong, String postUuid) {
		praiseMapper.updateReplyPraise(belong, postUuid);
	}

}
