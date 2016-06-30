package com.test.inheritance;

public class ClassOne {
	int a=0;
	ClassOne(){
		System.out.println("constracror for ClassOne");
		
	}
	
  public void setValues(int b){

	  this.a=b;
		System.out.println("Set values for ClassOne  --> "+ this.a);

  }
  
public int getValues(){
	System.out.println("constracror for ClassOne  --> "+ this.a);

	 return this.a;
  }
  
}
