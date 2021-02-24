package com.practice.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largeststring(3);

	}
	static String Largeststring(int value) {
		String str="";
		//String[] Arr = {"aa","bbb","ccccc","dddd","a"};
	
		List<String> a = Arrays.asList("aa","bbb","ccccc","dddd","a");
		List<String> l =a.stream().sorted().collect(Collectors.toList());
		str = l.get(value-1);
		System.out.println(str);
		return str;
	}
}
