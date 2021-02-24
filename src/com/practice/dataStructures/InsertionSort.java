package com.practice.dataStructures;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {49,45,67,12,34,10};	
		sort(arr, arr.length);
		printArray(arr);
		//45,49,67,12

	}
	private static void sort(int[] arr, int l) {
		
		for(int i=1;i<l;i++) {	
			int hole=i-1;
			int value = arr[i];
			while(hole>=0 && arr[hole]>value) {
				arr[hole+1] = arr[hole];
				hole--;
			}
			arr[hole+1] = value;
		}
	}
	static void printArray(int[] ar){
		int n = ar.length;
        for (int i = 0; i < n; ++i)
            System.out.print(ar[i] + " ");
        System.out.println();
	}

}
