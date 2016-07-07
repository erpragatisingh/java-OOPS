package blocks.instance;

public class ExOneInstanceBlock {
	  // why use instance Block
	 // 1) Use to write logic
	// 2) Use to Initialize variables
   //             Both are done using object creation
	
	//  Main difference between Constructor and instance block is 
   //   at time of object creation different contractor can call but same instance block will execute
	
	{System.out.println(" First Instance Block");}
	{System.out.println(" Second Instance Block");}
	
	public ExOneInstanceBlock() {
		System.out.println("0 arg constructor ");
	}
	public ExOneInstanceBlock(int q) {
		System.out.println("1 arg constructor ");

	}
	public ExOneInstanceBlock(int v,int s) {
		System.out.println("2 arg constructor ");

	}
	public ExOneInstanceBlock(int a, int d,int c) {
		System.out.println("3 arg constructor ");

	}

	public static void main(String[] args) {
		new ExOneInstanceBlock();
		new ExOneInstanceBlock(10);
		new ExOneInstanceBlock(12,34);
		new ExOneInstanceBlock(344,56,54);
		
	}
// output is 
	
//	 First Instance Block
//	 Second Instance Block
//	0 arg constructor 
//	 First Instance Block
//	 Second Instance Block
//	1 arg constructor 
//	 First Instance Block
//	 Second Instance Block
//	2 arg constructor 
//	 First Instance Block
//	 Second Instance Block
//	3 arg constructor 

	
	
}
