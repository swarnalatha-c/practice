package com.practice.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class merge {
	//static int counter =0;
	
	static transient int i;
	public static void main(String[] args) {
		
		
int[] arr = { 12, 11, 12, 5, 6, 5,12,11 };
		//List<Number> l= new ArrayList<Float>();
		//sort(arr,0,arr.length-1);
		//printArray(arr);

int x,result;
x=1;
result=0;
while(x<=10) {
	if(x%2==0)
		result+=x;
	++x;
}
System.out.println(result);
		System.out.println(1%2);
		//ArrayList alist =new CopyOnWriteArrayList();

ArrayList<Integer> i=new ArrayList(Arrays.asList(arr));

//HashMap<Integer,Integer> hm=i.stream().sorted().collect(Collectors.groupingBy(, null));

	}
	

}
