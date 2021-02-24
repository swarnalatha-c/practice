package com.practice.java;

public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int intReversal() {
		int val=1234;
		int reversed=0;
		int digit;
		while(val>0) {
			digit=val%10;
			reversed= reversed*10+digit;
			val=val/10;
		}
		System.out.println(reversed);
		return reversed;
		
	}
	
	static void stringReversal() {
		String str="Swarna";
		String reversed="";
		int length = str.length();
		
		for(int i=length;i>0;i--) {
			reversed+=str.charAt(i);
		}
	}

}
