package com.forum.serviceImpl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.bean.Post;
import com.forum.mapper.PostMapper;
import com.forum.service.PostService;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostMapper postMapper;
	
	public List<Post> selAllPost() {
		return postMapper.selAllPost();
	}
	
	public List<Post> selAllByBlock(String block) {
		return postMapper.selAllByBlock(block);
	}

	public void newPost(String belong, Timestamp sendTime, int watched, int praise, int reply, String title,
			String block, String type, String fujian, String context, String uuid) {
		postMapper.newPost(belong, sendTime, watched, praise, reply, title, block, type, fujian, context,uuid);
		
	}

	public Post selPostByUUID(String uuid) {
		return postMapper.selPostByUUID(uuid);
	}

	public void updateWatched(String uuid) {
		postMapper.updateWatched(uuid);
	}

	public void updatePraise(String uuid) {
		postMapper.updatePraise(uuid);
	}

	public void updateReply(String uuid) {
		postMapper.updateReply(uuid);
	}
}
