package com.practice.java;

public class HCLEmployee {
	
	private int uId;
	private String name;
	private String role;
	
	
	public HCLEmployee(int uId, String name, String role) {
		super();
		this.uId = uId;
		this.name = name;
		this.role = role;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "HCLEmployee [uId=" + uId + ", name=" + name + ", role=" + role + "]";
	}
	
	

}
