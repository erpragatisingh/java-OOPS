package com.test.method;

public class ExTwo {
	// instance Method 
		void m1(int a, Character ch){ // var in parameter is local val 
			System.out.println("M1 Instance Methos");
			System.out.println("INT VAL IS "+ a);
			System.out.println("Character VAL IS "+ ch);
		}
		// static Method
		static void  m2(String s,double d){
			System.out.println("M2 Static Methos");
			System.out.println("M2 Static Methos String val is -- "+ s);
			System.out.println("M2 Static Methos Double val is -- "+ d);
		}
	public static void main(String[] args) {
		 ExTwo exTwo=new ExTwo();
		 exTwo.m1(23, 'c'); // Accessing instance Method
      // Accessing static Methods		 
		 ExTwo.m2("Pragati",  10.5);
	}

}
