package com.oops.polymorpgism;

public final class ParentFinal {
   int a;
   
	public ParentFinal() {
		System.out.println("message from Parent()");

 	}
	public ParentFinal(int a) {
		System.out.println("message from Parent(int a)");
	
 	}
	public ParentFinal(int b,int a) {
		System.out.println("message from Parent(int b,int a)");
	
 	}
	public ParentFinal(char ch) {
		System.out.println("message from Parent(char ch)");
	
 	}
	
 public final void MOneFinal(){
	  
	  
  }
	
public void MOne(int one){
	  
	  
  }

public int  MOne(int one,int two){
	  
	 return one; 
}

// coherient type overriding
public Child  MOne(Object o){
	  
	 return new Child(); 
}





}
