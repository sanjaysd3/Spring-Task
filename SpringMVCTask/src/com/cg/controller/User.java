package com.cg.controller;

public class User {
	
	private String name;
	private String age;
	private String mail;
	private String mobile;
	
	public User() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public User(String name, String age, String mail, String mobile) {
		super();
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.mobile = mobile;
	}
	
	

}
