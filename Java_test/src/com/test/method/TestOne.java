package com.test.method;

public class TestOne {
// instance Method 
	void m1(){
		System.out.println("M1 Instance Methos");
	}
	// static Method
	static void  m2(){
		System.out.println("M2 Static Methos");
	}
	
 

public static void main(String[] args) {
	
 TestOne one=new TestOne();
  one.m1();
  one.m2();
  TestOne.m2();
		
		
		
	}

}
