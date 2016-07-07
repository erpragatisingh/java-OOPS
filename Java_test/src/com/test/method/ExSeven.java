package com.test.method;

public class ExSeven {
	int x=100;  // instance variable
	int y=1000;
	
	  void  add(int x,int y){// method Signature
		System.out.println("Addition of number is--- "+ (x+y)); // local variable
		//System.out.println("Addition of number is--- "+ (this.x+this.y));
	}											// for using instance variable
	

	public static void main(String[] args) {
     
		ExSeven exSeven = new ExSeven();
		exSeven.add(120, 22);
		
	}

}
