package com.forum.bean;

public class Block {
	
	private int id;
	private String name;
	private int admin;
	private String image;
	private int num;
	private int focus;
	private String uuid;
	
	
	public Block(int id, String name, String image, int admin,  int num, int focus, String uuid) {
		super();
		this.id = id;
		this.name = name;
		this.admin = admin;
		this.image = image;
		this.num = num;
		this.focus = focus;
		this.uuid = uuid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getFocus() {
		return focus;
	}

	public void setFocus(int focus) {
		this.focus = focus;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "Block [id=" + id + ", name=" + name + ", admin=" + admin + ", image=" + image + ", num=" + num
				+ ", focus=" + focus + ", uuid=" + uuid + "]";
	}

}
