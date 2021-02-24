package com.practice.dataStructures;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {23,45,67,12,34,10};	
		sort(arr, arr.length);
		printArray(arr);

	}
	private static void sort(int[] arr, int l) {
		int c=0;
		int temp=0;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]>arr[j]) {
					c=j;
				}
				temp=arr[i];
				arr[i]=arr[c];
				arr[c]=temp;
			}
		}
		
	}
	static void printArray(int[] ar){
		int n = ar.length;
        for (int i = 0; i < n; ++i)
            System.out.print(ar[i] + " ");
        System.out.println();
	}

}
