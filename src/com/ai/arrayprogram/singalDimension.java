package com.ai.arrayprogram;

public class singalDimension {
	public static void main(String[] args) {
		int []arr= {10,20,30,};
		int flag =0;
		for (int x:arr) {
			System.out.println(x);
			flag= x+flag;
			System.out.println(flag);
			
		}
	}

}
