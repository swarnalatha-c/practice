package com.practice.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="swarna";
		String s2=new String("swarna");
		float a =5.1f;
		int  b=2;
		float c=(a+b);
		String s= s1+b;
		System.out.println("print c "+ c);
		System.out.println(a==b);
		System.out.println(s1.equals(s2));
		List<Laptop> laps = new ArrayList();
		laps.add(new Laptop("dell",16,800));
		laps.add(new Laptop("apple",12,1800));
		laps.add(new Laptop("Acer",6,700));
		
		
		
		/*
		 * Collections.sort(laps); laps.forEach(System.out::println);
		 */
		
		//laps.stream().sorted().forEach(System.out::println);
		laps.stream().sorted( (o1,o2) -> o1.getPrice()>o2.getPrice() ? 1 : -1).forEach(System.out::println);
		
		
		
		/*
		 * Comparator<Laptop> c = new Comparator<Laptop>() {
		 * 
		 * @Override public int compare(Laptop o1, Laptop o2) { if(o1.getPrice()>
		 * o2.getPrice()) return 1; else return -1; }
		 * 
		 * };
		 * 
		 * Collections.sort(laps, c); System.out.println(laps);
		 */

	}

}
