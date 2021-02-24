package com.practice.java8;

import java.util.HashMap;

public final class ImmutableEx {
	private final int id;
	private final String name;
	//private final HashMap<Integer, String> hm;
	
	
	
	public ImmutableEx(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		//this.hm = hm;
		//HashMap<Integer,String> tempHm=new HashMap<>();
			//Set<int> s= hm.g
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	

}
