package com.practice.java;

public class TypeCast {

	/*
	 * public static void main(String[] args) throws Exception {
	 * 
	 * TypeCast t= new TypeCast(); t.typing(); }
	 */

	public void typing() throws Exception
	{try 
	{
		System.out.println("try");
		int a =5/2;
		System.out.println(a);
		
	}
	catch(Exception e){
	System.out.println("catch " + e);	
	}
	finally {
		System.out.println("finally");
	}
	System.out.println("ended");
	}


public void xyz() {
	System.out.println("in next mathod");
	int a= 8/0;
}
}
