package demo.constructor;


public class UseConstructorTwo {
// calling one(1) arg by using 0- arg constructor
	public UseConstructorTwo() {
		this(20);// will call 1 arg constructor
		this(34, 11); // will call 2 arg constructor 
		System.out.println("Empty constructor");
	}
	public UseConstructorTwo(int a) {
		this(34, 11); // will call 2 arg constructor 
		System.out.println("single 1-arg constructor");
		
		// we can not call constructor in second line, Constructor call must be the first 
		// statement in a constructor
		                     

	}
	public UseConstructorTwo(int a, int b) {
		System.out.println("Two 2-arg constructor");
	}

	public static void main(String[] args) {
		
		UseConstructorTwo constructor= new UseConstructorTwo();

	}

}
 ////////// Result will be ///////////////

// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	Constructor call must be the first statement in a constructor
//
//	at demo.constructor.UseConstructorTwo.<init>(UseConstructorTwo.java:12)
//	at demo.constructor.UseConstructorTwo.<init>(UseConstructorTwo.java:7)
//	at demo.constructor.UseConstructorTwo.main(UseConstructorTwo.java:21)
//
