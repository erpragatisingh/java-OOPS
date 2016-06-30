package com.test.inheritance;

public class ClassTwo extends ClassOne {
 int p=0;
	public ClassTwo() {
		System.out.println("constracror for ClassTwo");
	}

	
	  public void setValues(int b){
		  super.setValues(b);
		  this.p=b;
		  System.out.println("constracror for ClassTwo set values "+ this.p);
	  }
	  
	public int getValues(){
		
		System.out.println("constracror for ClassTwo  --> "+ this.a);
		super.getValues();
		System.out.println("constracror for ClassTwo  --> "+ this.p);

		 return this.p;
	  }
}
