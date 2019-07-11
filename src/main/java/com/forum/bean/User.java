package com.forum.bean;

/**
 * 用户POJO
 * @author Coding
 *
 */
public class User {
	private String name;
	private String password;
	private int stuID;
	private String grade;
	private int access;
	private String sendNum;
	private String replyNum;
	private String praiseNum;
	private String image;
	private int markToday;
	private int markSum;
	private int experience;
	
	public User(String name, String password, int stuID, String grade, int access, String sendNum, String replyNum,
			String praiseNum, String image, int markToday, int markSum, int experience) {
		super();
		this.name = name;
		this.password = password;
		this.stuID = stuID;
		this.grade = grade;
		this.access = access;
		this.sendNum = sendNum;
		this.replyNum = replyNum;
		this.praiseNum = praiseNum;
		this.image = image;
		this.markToday = markToday;
		this.markSum = markSum;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAccess() {
		return access;
	}
	public void setAccess(int access) {
		this.access = access;
	}
	public String getSendNum() {
		return sendNum;
	}
	public void setSendNum(String sendNum) {
		this.sendNum = sendNum;
	}
	public String getReplyNum() {
		return replyNum;
	}
	public void setReplyNum(String replyNum) {
		this.replyNum = replyNum;
	}
	public String getPraiseNum() {
		return praiseNum;
	}
	public void setPraiseNum(String praiseNum) {
		this.praiseNum = praiseNum;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getMarkToday() {
		return markToday;
	}
	public void setMarkToday(int markToday) {
		this.markToday = markToday;
	}
	public int getMarkSum() {
		return markSum;
	}
	public void setMarkSum(int markSum) {
		this.markSum = markSum;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", stuID=" + stuID + ", grade=" + grade + ", access=" + access + ", sendNum="
				+ sendNum + ", replyNum=" + replyNum + ", praiseNum=" + praiseNum + ", image=" + image + ", markToday="
				+ markToday + ", markSum=" + markSum + ", experience=" + experience + "]";
	}
}
