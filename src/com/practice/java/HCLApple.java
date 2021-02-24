package com.practice.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HCLApple {
	/*
	 * A= [{"uid":1, "name":"Siva"},{"uid":2, "name":"raghuveer"},{"uid:3",
	 * //"name":"Alex"}]
	 * 
	 * B = [{"uid":2, "role":"Developer"},{"uid":1, "role":"Admin"}
	 * 
	 * 
	 * EXPECTED OUTPUT	 * 
	 * 
	 * {"uid":1, "name":"Siva", "role":"Admin"},
	 * 
	 * {"uid":2,"name":"raghuveer","role":"Developer"},
	 * 
	 * {"uid":3, "name":"Alex", "role":null}]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userDetails();

	}
	
	static void userDetails() {
		String userName="";
		String role = "";
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1,"Admin");
		hm1.put(2,"Developer");
		//hm1.put(3,"");
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(1,"siva");
		hm2.put(2,"raghuveer");
		hm2.put(3,"Alex");
		
		Set<Integer> s = hm2.keySet();			
		List<HCLEmployee> hclEmp = new ArrayList<>();
		
			for(Integer i : s) {
				userName = hm1.get(i);
				role = hm2.get(i);
				hclEmp.add(new HCLEmployee(i, role,userName));
			}
		
		hclEmp.forEach(System.out::println);
	}

}
