package com.ai.arrayPrac;

public class ArrayPractise {

	public static void main(String[] args) {

		int[] a = { 10, 15, 20, 25, 30 };
		int flag=0;
		

		for ( int x : a) {
			flag=x+flag;
		
		}
		System.out.println(flag);

		/*
		 * a[4] = 60; System.out.println(a[4]);
		 * 
		 * System.out.println(a.length);
		 */
	}

}
