package com.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//ArrayList<Integer> nums = Arrays.asList(23,34,44);


public class practice {
	 static List<Integer> nums=Arrays.asList(34, 56, 67, 89, 56, 34, 89, 67, 67, 89, 8, 90, 56, 67, 23, 12, 54);
	
	public static void main(String[] args) {
		practice p = new practice();
		p.findDuplicates(nums);

	}
	
	 List<Integer> findDuplicates(List<Integer> l){
		 ArrayList<Integer> duplicate = new ArrayList<>();
		 Set<Integer> s = new HashSet<>();
		int length= l.size();
		for(int i=0;i<length;i++) {
			
				
					if(duplicate.contains(l.get(i))) {
						s.add(l.get(i));
						//System.out.println(l.get(i));
						
					}
					else {
						//System.out.println(l.get(i));
						duplicate.add(l.get(i));
						
					}
					
				
		}
		for(Integer e : s)
			System.out.println(e);
		return duplicate;
		
	}
	/*
	 * List<Integer> findDuplicates(List<Integer> l){ ArrayList<Integer> duplicate =
	 * new ArrayList<>(); int length= l.size(); for(int i=0;i<length;i++) { for(int
	 * j=i+1;j<length;j++) { if(l.get(i)==l.get(j)) {
	 * if(!duplicate.contains(l.get(i))) duplicate.add(l.get(i)); } continue;
	 * 
	 * } } for(Integer i: duplicate) System.out.println(i); return duplicate;
	 * 
	 * }
	 */
}
