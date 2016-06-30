package com.oops.polymorpgism;

public class Parent {

	public Parent() {
		System.out.println("message from Parent()");

 	}
	public Parent(int a) {
		System.out.println("message from Parent(int a)");
	
 	}
	public Parent(int b,int a) {
		System.out.println("message from Parent(int b,int a)");
	
 	}
	public Parent(char ch) {
		System.out.println("message from Parent(char ch)");
	
 	}
	
	//coherient type overriding
	public Child  MOne(Object o){
		  
		 return new Child(); 
	}
	
	
	private void privateMethod(){
		System.out.println("message from private Method ");

		
	}
	
	private static void  StaticMethod(){
		System.out.println("message from Static Method ");

		
	}
	
	
}
