package com.ai.arrayprogram;

public class FactorialProg {
	
	int factorialMethod(int a){
		
		if(a!=0) {
			return a*factorialMethod(a-1);  // recursion
		}
		else {
			return 1;
		}
		
	}
	public static void main(String[] args) {
		FactorialProg fp =new FactorialProg();
	int no=	fp.factorialMethod(5);
	
	System.out.println(no);
	}

}
