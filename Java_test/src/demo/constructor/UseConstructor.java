package demo.constructor;

public class UseConstructor {
// calling one(1) arg by using 0- arg constructor
	public UseConstructor() {
		this(20);// will call 1 arg constructor
		System.out.println("Empty constructor");
	}
	public UseConstructor(int a) {
		this(34, 11); // will call 2 arg constructor
		System.out.println("single 1-arg constructor");
	}
	public UseConstructor(int a, int b) {
		System.out.println("Two 2-arg constructor");
	}

	public static void main(String[] args) {
		
		UseConstructor constructor= new UseConstructor();

	}

}
 ////////// Result will be ///////////////

//	Two 2-arg constructor
//	single 1-arg constructor
//	Empty constructor
