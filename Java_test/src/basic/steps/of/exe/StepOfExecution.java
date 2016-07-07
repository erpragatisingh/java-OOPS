package basic.steps.of.exe;

public class StepOfExecution {
	// instance var
	int a;
	String s;
	// static var
	static String p;
	// Static Block execute only once if object create multiple as well.
	
 static{  // 1)  first static block will execute
	            //  it can execute with or without obj creation 
	           //   but class must be loaded
	System.out.println("Static Block");
	// System.out.println(s);  // static block can take only static var
	System.out.println("Static Block var before init p " + p);

	  p="gaganjeet";  // static var can init only in static block or static method
//	  s="pragti";   // it can not be done
		System.out.println("Static Block var after init p " + p);
 
       }
   
// 2) second instance block will execute
 
       // it can execute only while obj creation
    {  // instance block
		System.out.println("Instance Block");
		System.out.println("Instance Block default val of String  s is  " +s);
		System.out.println("Instance Block default val of int  a is  " + a);
	}
	// 3) after block execution user defined/ default  constructor
	public StepOfExecution() {
		// initializing  business logic or assigning default values 
		// at time of obj creation
		s="Pragati";  // assign val to s in user defined cons
		System.out.println("assign val to s in user defined cons s= "+s);
	}
// instance method
	void m1(){
		System.out.println("Method 0 arg");
	}  
	// static method
	static void m2(String s){
		System.out.println("Static Method 0 arg - "+ s);
	}
	public static void main(String[] args) {
		
		 StepOfExecution execution=new StepOfExecution();
		 execution.m1();// method calling
		 execution.m2("acess with help of class obj");// static method call with help of lass obj
		 StepOfExecution.m2("acess with help of class Name"); // static method can call with or without ( help of class name ) obj craetion
	}
///    Output of program
	
	
//	Static Block
//	Static Block var before init p null
//	Static Block var after init p gaganjeet
//	Instance Block
//	Instance Block default val of String  s is  null
//	Instance Block default val of int  a is  0
//	assign val to s in user defined cons s= Pragati
//	Method 0 arg
//	Static Method 0 arg - acess with help of class obj
//	Static Method 0 arg - acess with help of class Name


	
	
}
