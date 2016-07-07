package com.test.method;

public class ExSix {
	// instance Method 
		void m1( ){   
 			System.out.println("M1 instance Method");
 						void m2(){   
 							System.out.println("M2 instance Method");
 						}
	}
		
	public static void main(String[] args) {
		ExSix exFour=new ExSix();
		exFour.m1( );
 	}
 
}
