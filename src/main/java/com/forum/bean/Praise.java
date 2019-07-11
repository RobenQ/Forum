package com.forum.bean;

public class Praise {
	private String belong;
	private String postUuid;
	private String replyUuid;
	private boolean statusPost;
	private boolean statusReply;
	
	public Praise(String belong, String postUuid, String replyUuid, boolean statusPost, boolean statusReply) {
		super();
		this.belong = belong;
		this.postUuid = postUuid;
		this.replyUuid = replyUuid;
		this.statusPost = statusPost;
		this.statusReply = statusReply;
	}

	public String getBelong() {
		return belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}

	public String getPostUuid() {
		return postUuid;
	}

	public void setPostUuid(String postUuid) {
		this.postUuid = postUuid;
	}

	public String getReplyUuid() {
		return replyUuid;
	}

	public void setReplyUuid(String replyUuid) {
		this.replyUuid = replyUuid;
	}

	public boolean isStatusPost() {
		return statusPost;
	}

	public void setStatusPost(boolean statusPost) {
		this.statusPost = statusPost;
	}

	public boolean isStatusReply() {
		return statusReply;
	}

	public void setStatusReply(boolean statusReply) {
		this.statusReply = statusReply;
	}

	@Override
	public String toString() {
		return "Praise [belong=" + belong + ", postUuid=" + postUuid + ", replyUuid=" + replyUuid + ", statusPost="
				+ statusPost + ", statusReply=" + statusReply + "]";
	}
}
