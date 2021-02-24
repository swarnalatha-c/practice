package com.practice.java;

public class LargestPalindromeSubString {
	int resultStart, resultLength;
	String s="acbcababaacbac";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LargestPalindromeSubString l= new LargestPalindromeSubString();
	String str = l.palindrome();
	System.out.println(str);
	}
	
	String palindrome() {
		int length=s.length();
		if(length<2)
			return s;
		
		for(int i=0;i<length-1;i++) {
			int start=i;
			expandRange(s,start,start);
			//expandRange(s,start,start+1);
		}
		
		
		return s.substring(resultStart,resultStart+resultLength);
	}

	private void expandRange(String s, int start, int end) {
		while(start>=0 && end<s.length()  && s.charAt(start)==s.charAt(end)) {
			start--;
			end++;
		}
		if(resultLength<end-start-1) {
			resultStart=start+1;
			resultLength=end-start-1;
		}
				
	}

}
