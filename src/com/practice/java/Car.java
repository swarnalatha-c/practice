package com.practice.java;

public class Car implements Vehicla, FourWheeler{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWheeler v=new Car();
		v.type();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		FourWheeler.super.run();
		
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		
	}
	
	public int add(int a, int b) {
		System.out.println("add");
		return a+b;
	}
	public int add(int a, float b) {
		float c= a+b;
		return (int)c;
	}

}
