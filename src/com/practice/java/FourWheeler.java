package com.practice.java;

public interface FourWheeler {
	
	void type();
	default void run() {
		System.out.println("four wheeler is running");
	}

}
