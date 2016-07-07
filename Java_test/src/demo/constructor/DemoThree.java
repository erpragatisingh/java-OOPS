package demo.constructor;

public class DemoThree {

	public DemoThree(int a) {}

	public static void main(String[] args) {
		
		DemoThree three = new DemoThree();
		// if there is no constuctor compile will generator else will not we 
		  // have to use created only

	}
	// Result 
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		The constructor DemoThree() is undefined
//
//		at demo.constructor.DemoThree.main(DemoThree.java:9)
}
