package com.practice.dataStructures;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {23,45,67,12,34,10};	
		sort(arr, arr.length);
		printArray(arr);

	}
	static void printArray(int[] ar){
		int n = ar.length;
        for (int i = 0; i < n; ++i)
            System.out.print(ar[i] + " ");
        System.out.println();
	}

	private static void sort(int[] arr,  int l) {
		int c=0;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l-1;j++) {
				if(arr[j]>arr[j+1]) {
					c=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=c;
				}
				
			}
		}
		
		
	}
	
	

}
