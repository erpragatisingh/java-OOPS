package blocks.Static;

public class ExOneStaticBlock {
// static block
	 // 1) First static block will execute because it call at time of class loading
	// 2) in single class multiple static block we can create.
   //  3)after 1.5 Without main Method it can not execute but it can call from main method contains class
  //  up-to 1.5 static block can execute without main or we can say main method is optional
//	4) static block can use to initliaze static variable
	static{
		System.out.println("Second Static Block");	
		}
	static{
		System.out.println("First static Block");	
	}


//  Instance Block
// after static block instance block will execute
// instance block will execute when object will created else not
	
		{  System.out.println("Second Instance Block"); }	

		{  System.out.println("First Instance Block");	}
 
   
	public ExOneStaticBlock() {
		System.out.println("0 arg constructor");	
		
	
	}

	public static void main(String[] args) throws ClassNotFoundException{
		new ExOneStaticBlock();
		new ExOneStaticBlock();
		new TestStatic(); // calling static block of class TestStatic and it have no main method
		   // second way to call because its way lo load class dynamically
		 
			Class.forName("ExOneStaticBlock");
		 
		
		// Result of this sequence
 
//		Second Static Block
//		First static Block
//		Second Instance Block
//		First Instance Block
//		0 arg constructor
//		Second Instance Block
//		First Instance Block
//		0 arg constructor
//		Static block 1 from class without main method
//		Static block 2 from class without main method

		

	}

}
// 	// Result of this sequence

//	new TestStatic();
//	new ExOneStaticBlock();
//	
//	Second Static Block
//	First static Block
//	Static block 1 from class without main method
//	Static block 2 from class without main method
//	Second Instance Block
//	First Instance Block
//	0 arg constructor