package com.oops.polymorpgism;

public class Child extends Parent {

public Child() {
	
		System.out.println("message from Child()");
		
	}

public Child(int a) {
	System.out.println("message from Child(int a)");

		
	}

public Child(int a,int b) {
	
	System.out.println("message from Child(int a,int b)");

}

public Child(char ch) {
	
	System.out.println("message from Child (char ch)");

}

//coherient type overriding
public Child  MOne(Object o){
	  
	 return new Child(); 
}


public static void main(String[] args) {
		 Parent c= new Child();
		 c.MOne(new Child()) ;
		 
		// Child c=new Parent();
		 Parent p =new Parent();
		 p.MOne(new Parent());
		
				 
				 
	}

}
