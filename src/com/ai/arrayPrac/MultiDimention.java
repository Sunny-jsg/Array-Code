package com.ai.arrayPrac;

public class MultiDimention {

	public static void main(String[] args) {
  
		int[][] myArray= {{10,20,30},{40,50}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("MyArray Value : "+myArray[i][j]);
			}
		}
	}

}
