package com.practice.java;

import java.util.Optional;

class EmployeeSub extends EmployeeSuper{
	
	/*
	 * static { System.out.println("1.1"); } { System.out.println("2.1"); } public
	 * EmployeeSub() {
	 * 
	 * System.out.println("3.1");}
	 */
	
	
	
	  void add() { System.out.println("child"); }
	 
	  void display() {
		 add();
		 super.add();
	 }
	 
	 public static void main(String[] args) {
		 
		 
		 
		 EmployeeSub e= new EmployeeSub() ;
			e.display();
		 
		}
	 


}

class Teacher extends EmployeeSub{
public static void main(String[] args) {
		
	Teacher e= new Teacher();
		e.add();
	}

@Override
void add() {
	// TODO Auto-generated method stub
	System.out.println("in child class");
	
}
	
}
