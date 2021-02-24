package com.practice.java;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringReverse();
	}
	
	static void fuzzz() {
		
		  for(int i=1;i<=100;i++) { if(i%3==0 && i%5==0)
		  System.out.println(i+" is divisible by 3 and 5"); else if(i%3==0 )
		  System.out.println(i+" is divisible by 3 "); else if(i%5==0 )
		  System.out.println(i+" is divisible by 5 "); else System.out.println(i);
		  
		  }}
		 
		static void buzzz() {
			int[] arr= {10,7,21,2};
			int value = 9;
			int length = arr.length;
			int n1=0,n2=0;
			for(int i=0;i<length;i++) {
				if(arr[i]>=value)
					continue;
				for(int j=i+1;j<length;j++) {
					if(arr[i]+arr[j]==value) {
						n1=i;
						n2=j;
					}
				}
			}
			System.out.println("value of "+n1 + "value of "+  n2);
		}
		
	static void stringReverse() {
		String s="swarna";
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	}

}
