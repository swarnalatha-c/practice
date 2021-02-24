package com.practice.java8;

public class SingltonDemo {
	// Institute ins;

	public static void main(String[] args) {

		Institute ins1 = Institute.getInstitute(1, "JNTU", "Hyderabad");
		Institute ins2 = Institute.getInstitute(2, "JNTU", "Hyderabad");

		System.out.println(ins1.hashCode());
		System.out.println(ins2.hashCode());
		System.out.println(ins1.toString());
		System.out.println(ins2.toString());

	}

}
