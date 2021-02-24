package com.practice.java;

public class MyDataImpl implements MyData {

	/*
	 * public boolean isNull(String str) { System.out.println("Impl Null Check");
	 * 
	 * return str == null ? true : false; }
	 */
	
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		MyData.isNull("abc");
	}
}