package com.tmobile.training.model;

public class Profile {
	
	private String gender;
	private String name;
	private int age;
	private int id;
	
	// need to make getters and setters for all fields
	
	// 1: gender
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// 2: name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 3: age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 4: id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
