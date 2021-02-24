package com.practice.java;

import java.util.Arrays;
import java.util.List;

public class PersistanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b = PersistanceTest.checkduplicates();
		System.out.println(b);
	}
	
	static Boolean checkduplicates() {
		
		String s1="rock";//0
		//ockr,  ckro,  kroc
		String s2="ockr";
		Boolean rotational =false;
		String s= s1+s1;
		System.out.println(s);
		if(s.contains(s2))
			rotational=true;
		return rotational;
		}

	
		
		
	
}
