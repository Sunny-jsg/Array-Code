package com.ai.arrayprogram;

public class MaxMinProg {
	public static void main(String[] args) {
		int[] a= {22,13,12,44,65,11,3,56,9};
	   int min=a[0];
	   int max=a[0];
	   
	   for(int i=1;i<=a.length-1;i++) {
		   if(max<a[i]) {
			   max=a[i];
		   }
		   if(min>a[i]) {
			   min=a[i];
		   }
	   }
	   System.out.println("max value : "+max);
	   System.out.println("min value :"+min);
		
	}

}
