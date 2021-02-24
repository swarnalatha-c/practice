package com.practice.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamConversion {
	static Student s1=new Student("swarna",1,23);
	static Student s2=new Student("vidya",2,78);
	static Student s3=new Student("chinni",3,78);
	static Student s4=new Student("rama",4,23);
	static List<Student> a= Arrays.asList(s1,s2,s3,s4);

	public static void main(String[] args) {
		//StreamConversion.listToMap();
		StreamConversion.sort();
		}
	static void sort() {
		Map<String, Student> h= a.stream().collect(Collectors.toMap(Student::getName, Student -> Student));
		System.out.println(h);
	}
	static void listToMap() {
		Map<Integer,Student> m= a.stream().collect(Collectors.toMap(Student::getId, Student -> Student));
		
		System.out.println(a.stream().map(b->b.name).collect(Collectors.joining(", ")));
		//m.forEach(System.out::println);
		
		/*
		 * m.entrySet().forEach(entry->{ System.out.println(entry.getKey() + " " +
		 * entry.getValue()); });
		 */
	}
	
	 void listFilter() {
		/*
		 * Student s1=new Student("swarna",1); Student s2=new Student("vidya",2);
		 * Student s3=new Student("chinni",3); Student s4=new Student("rama",4);
		 * List<Student> a= Arrays.asList(s1,s2,s3,s4);
		 */
		
		System.out.println(a.stream().filter(b->b.id==8).findAny().get());
	}
	
	
	static int test() {
		List<Integer> l= Arrays.asList(1,2,34,45);
		int a=3;
		int b=6;
		
		int c= a==b ? 1 : a>b ? a+b : 0;
		return c;
		
	}

}
