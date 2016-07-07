package com.test.method;
// Two Method have same signature not allowed
public class ExFour {

	// instance Method 
	void m1( ){ // var in parameter is local val 
		// here val ids type of class 
		System.out.println("M1 instance Method"); 
	}
	// static Method here values of class type
	  void  m1( ){
		System.out.println("M2 instance Method"); 

	}
public static void main(String[] args) {
	ExFour exFour=new ExFour();
	exFour.m1( );
	exFour.m2();
}

}
