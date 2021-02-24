package com.practice.java8;

public class Student  {
	
	
	String name;
	int id;
	int marks;
	
	public int getMarks() {
		return marks;
	}
	public Student(String name, int id, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	/*
	 * public Student(String name, int id) { super(); this.name = name; this.id =
	 * id; }
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	
	
	
	}
	


