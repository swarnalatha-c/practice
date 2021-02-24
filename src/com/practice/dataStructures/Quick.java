package com.practice.dataStructures;

public class Quick {

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		
		sort(arr,0,arr.length-1);
		printArray(arr);
		

	}

	private static void sort(int[] arr, int start, int end) {
		
		if(start<end) {
			int pi = partition(arr, start, end);
			
			sort(arr, start, pi-1);
			sort(arr, pi+1, end);
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i=start-1;
		for(int j=start;j<end;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		
		return i+1;
	}
	 /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
