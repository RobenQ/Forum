package com.forum.bean;

import java.sql.Timestamp;

public class Reply {
	private String belong;
	private Timestamp sendTime;
	private String context;
	private String uuid;
	private int watched;
	private int reply;
	private int praise;
	private String myUuid;
	
	public Reply(String belong, Timestamp sendTime, String context, String uuid, int watched, int reply, int praise,
			String myUuid) {
		super();
		this.belong = belong;
		this.sendTime = sendTime;
		this.context = context;
		this.uuid = uuid;
		this.watched = watched;
		this.reply = reply;
		this.praise = praise;
		this.myUuid = myUuid;
	}

	public String getBelong() {
		return belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}

	public Timestamp getSendTime() {
		return sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getWatched() {
		return watched;
	}

	public void setWatched(int watched) {
		this.watched = watched;
	}

	public int getReply() {
		return reply;
	}

	public void setReply(int reply) {
		this.reply = reply;
	}

	public int getPraise() {
		return praise;
	}

	public void setPraise(int praise) {
		this.praise = praise;
	}

	public String getMyUuid() {
		return myUuid;
	}

	public void setMyUuid(String myUuid) {
		this.myUuid = myUuid;
	}

	@Override
	public String toString() {
		return "Reply [belong=" + belong + ", sendTime=" + sendTime + ", context=" + context + ", uuid=" + uuid
				+ ", watched=" + watched + ", reply=" + reply + ", praise=" + praise + ", myUuid=" + myUuid + "]";
	}
}
