package com.practice.java8;

public class Institute {
	
	private static Institute inst;
	static int id;
	static String name;
	static String address;
	
	
	/*
	 * private Institute() {
	 * 
	 * }
	 */
	
	
	private Institute(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


//	public static Institute getInst() {
//		return inst;
//	}
//
//
//	public static void setInst(Institute inst) {
//		Institute.inst = inst;
//	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public static Institute getInstitute(int i, String name, String address) {
		if(inst==null) {
			inst = new Institute(id, name, address);
		}
		return inst;	
		
	}


	@Override
	public String toString() {
		return "Institute [getId()=" + getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	

}
