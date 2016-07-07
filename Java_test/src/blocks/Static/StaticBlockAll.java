package blocks.Static;

public class StaticBlockAll {
   int a=0;  // instance var
   static int staticVar;   // static var
	static {System.out.println("Static Block one");} // static block
	// 
	{System.out.println("Instance block");}  // instance block
	
	public StaticBlockAll() {
		System.out.println("0 arg constructor");
	}
	
	public StaticBlockAll(int a) {
		System.out.println("1 arg constructor");
	}
	
	public StaticBlockAll(int a, int b) {
		System.out.println("2 arg constructor");
	}
	
	public StaticBlockAll(int a, int b, int c) {
		System.out.println("3 arg constructor");
	}

	void m1(){
		System.out.println("M1 Method");
	}
	static void m2(){
		System.out.println("static M2 Method");
	}
	
	public static void main(String[] args) {
		new StaticBlockAll().m1();
		
		new StaticBlockAll(10).m1();
		new StaticBlockAll(10,30).m1();
       
		StaticBlockAll.m2();
	}

}

// Result will

//	Static Block one
//	Instance block
//	0 arg constructor
//	M1 Method
//	Instance block
//	1 arg constructor
//	M1 Method
//	Instance block
//	2 arg constructor
//	M1 Method
//	static M2 Method




