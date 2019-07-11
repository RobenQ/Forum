package com.forum.bean;

public class UserBlock {
	private int studeid;
	private String blockName;
	
	public UserBlock(int studeid, String blockName) {
		super();
		this.studeid = studeid;
		this.blockName = blockName;
	}

	public int getStudeid() {
		return studeid;
	}

	public void setStudeid(int studeid) {
		this.studeid = studeid;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	@Override
	public String toString() {
		return "UserBlock [studeid=" + studeid + ", blockName=" + blockName + "]";
	}
}
