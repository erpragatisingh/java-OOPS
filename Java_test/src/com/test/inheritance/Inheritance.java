package com.test.inheritance;

public class Inheritance {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassOne one=new ClassOne();
		
		one.setValues(70);
		one.getValues();
		ClassTwo two=new ClassTwo();
         two.setValues(20);
         two.getValues();
         
         
         ClassOne mix1=new ClassTwo();
         mix1.setValues(40);
         mix1.getValues();
         
         
	}

}
