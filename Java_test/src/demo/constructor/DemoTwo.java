package demo.constructor;

public class DemoTwo {

	public DemoTwo() {
		System.out.println("User defined empty constructor");
	}
	public DemoTwo(int a) {
		System.out.println("User defined 1- arg constructor");
	}
	public DemoTwo(int a, String s) {
		System.out.println("User defined 2-arg constructor");
	}
	public static void main(String[] args) {

		DemoTwo two = new DemoTwo();
		DemoTwo two1 = new DemoTwo(12);
		DemoTwo two2 = new DemoTwo(30,"Pragati");
	} 
	// Result 
//	User defined empty constructor
//	User defined 1- arg constructor
//	User defined 2-arg constructor
}
