package com.java.entity;

public class Stu {
	private int id;
	private String name;
	private String sex;
	private int num;
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stu(int id, String name, String sex, int num) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.num = num;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", sex=" + sex + ", num=" + num + "]";
	}
	
}
