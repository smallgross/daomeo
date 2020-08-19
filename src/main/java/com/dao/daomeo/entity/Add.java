package com.dao.daomeo.entity;

public class Add {
	

	private  String name;
	private String brain;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrain() {
		return brain;
	}
	public void setBrain(String brain) {
		this.brain = brain;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Add [name=" + name + ", brain=" + brain + ", age=" + age + "]";
	}
	

}
