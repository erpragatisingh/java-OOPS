package ocjp.test;

public class StaticExeFlow {
	 static int p;  // static var
	 static int q;  // static var
   
   
   
   static void main(){
	  // StaticExeFlow.p=10;
		  System.out.println(StaticExeFlow.p +"");
	   System.out.println("Static Method");
   }
   
	public StaticExeFlow() {
	}

	public static void main(String[] args) {
		StaticExeFlow a = new StaticExeFlow();
		StaticExeFlow b = new StaticExeFlow();
		a.q = 5;
		
		b.q = 6;
		
		a.p = 1;
		
		b.p = 2;
		System.out.println("a.q = " + a.q);
		System.out.println("b.q = " + b.q);
		System.out.println("a.p = " + a.p);
		System.out.println("b.p = " + b.p);
		System.out.println("StaticExeFlow.p = " + StaticExeFlow.p);
	
		  
		 System.out.println("main Method");
		 main();
	}
	static{ System.out.println("Static Block");
	   System.out.println(StaticExeFlow.p +"");
	   }

}
