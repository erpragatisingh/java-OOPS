package demo.constructor;

public class DemoOne {
// instance method
	void m1(){
		System.out.println("Instance Method m1");
	}
	
//	DemoOne(){  when user not create any one constructor compiler
//	            generate 0 org constructor with empty implementation
//	            there is no body. and run time execute by compiler
//	          
//              constructor helps to create obj	
//	}
	
	public static void main(String[] args) {

		DemoOne demoOne=new DemoOne();
		demoOne.m1();
		
		// DemoOne = class name
		// demoOne = refrance var
		// =       = assignement operator
		// new    = used to care Object
		// DemoOne() = DemoOne class constructor
	}
} 
