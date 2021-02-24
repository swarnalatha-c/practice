package com.practice.java;

public class Merge {

	public static void main(String[] args) {
		int[] arr = {23,45,67,12,34,10};	
		sort(arr, 0, arr.length-1);
		//printArray(arr);
	}
	
	static void printArray(int[] ar){
		int n = ar.length;
        for (int i = 0; i < n; ++i)
            System.out.print(ar[i] + " ");
        System.out.println();
	}
	
	static void sort(int[] a, int l, int r) {
		if(l<r) {
		int m=(l+r)/2;
		//printArray(a);
		sort(a, l ,m);
		sort(a, m+1, r);
		
		mergeSort(a,l,m,r);
		
		
		}}

	 static void mergeSort(int[] a, int l, int m, int r) {
		 int n1= m-l+1;
		 int n2 = r-m;
		// System.out.println(l + ", "+ m +", "+r);
		 int[] L = new int[n1];
		 int[] R = new int[n2];
		 for(int i=0;i<n1;++i) {
			 L[i]=a[l+i];
		 }
		 
		 for(int j=0;j<n2;++j) {
			 R[j]=a[m+1+j];
		 }
		 printArray(L);
		 printArray(R);
		 int i=0,j=0;
		 int k = l;
		 
		 while( i<n1 && j<n2) {
			 if(L[i]<=R[j]) {
				 System.out.println("k = "+k +", value =" + L[i]);
				 a[k]=L[i];
				 i++;}
			 else {
				 System.out.println("k = "+k +", value =" + R[j]);
				 a[k]=R[j];
				 j++; }
			 k++;
		 }
		 while (i < n1) {
	            a[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) {
	            a[k] = R[j];
	            j++;
	            k++;
	        }
	        System.out.println(" array is");
		printArray(a);
	}
	
	
}
