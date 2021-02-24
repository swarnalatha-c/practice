package com.practice.java;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		System.out.println(p.getName());

	}

}

 class Parent{
	String name;
	Parent(){
		this.name="parent";
	}
	
	String getName() {
		return this.name;
	}
}
 