package com.practice.java;

public interface Vehicla {
	
	default void run() {
		System.out.println("vehcle is running");
	}

}
