package com.oops.polymorpgism;

public class ChildStatic extends ParentStatic{

	public ChildStatic() {
		  System.out.println("child constructor method");

	}
	public  void m1(){
		  System.out.println("child static method");
	  }
		
	public static void main(String[] args) {
		ChildStatic p = new ChildStatic();
		p.m1();
		
//		ParentStatic p = new ChildStatic();
//		p.m1();
//		
////		message from Parent()
//		child constructor method
//		child static method


		
	}

}
