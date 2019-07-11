package com.forum.bean;

import java.sql.Timestamp;

public class AD {
	private String belong;
	private String image;
	private Timestamp sendTime;
	private int watched;
	private int praise;
	private int reply;
	private String title;
	private String block;
	private String type;
	private String fujian;
	private String context;
	private String uuid;
	
	public AD(String belong, String image, Timestamp sendTime, int watched, int praise, int reply, String title,
			String block, String type, String fujian, String context, String uuid) {
		super();
		this.belong = belong;
		this.image = image;
		this.sendTime = sendTime;
		this.watched = watched;
		this.praise = praise;
		this.reply = reply;
		this.title = title;
		this.block = block;
		this.type = type;
		this.fujian = fujian;
		this.context = context;
		this.uuid = uuid;
	}

	public String getBelong() {
		return belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Timestamp getSendTime() {
		return sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public int getWatched() {
		return watched;
	}

	public void setWatched(int watched) {
		this.watched = watched;
	}

	public int getPraise() {
		return praise;
	}

	public void setPraise(int praise) {
		this.praise = praise;
	}

	public int getReply() {
		return reply;
	}

	public void setReply(int reply) {
		this.reply = reply;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFujian() {
		return fujian;
	}

	public void setFujian(String fujian) {
		this.fujian = fujian;
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

	@Override
	public String toString() {
		return "AD [belong=" + belong + ", image=" + image + ", sendTime=" + sendTime + ", watched=" + watched
				+ ", praise=" + praise + ", reply=" + reply + ", title=" + title + ", block=" + block + ", type=" + type
				+ ", fujian=" + fujian + ", context=" + context + ", uuid=" + uuid + "]";
	}
}
