package com.practice.dataStructures;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,12,23,34,45,65,76,87};
		int value =8;
		if(arr[0]<value && value<arr[arr.length-1])
		System.out.println(binarySearch(arr,0,arr.length-1,value));
		else 
			System.out.println("value is not available");
		
	}
	
	 static int binarySearch(int[] arr, int l, int r, int value) {
		
		int m= (l+r)/2;
		if(arr[m]==value)
			return m;
		else if(arr[m]>value)
			return binarySearch(arr, l, m-1, value);
		else if(arr[m]<value)
			return binarySearch(arr, m+1, r, value);
		else
			return -1;
			
	}

	

}
