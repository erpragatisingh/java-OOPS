package demo.constructor;

public class ExFive {
int a;
String s;
float f;

   void m1(){
	   System.out.println("Method m1");
	   System.out.println( a);
	   System.out.println(s);
	   System.out.println(f);
		  }
   

	public static void main(String[] args) {
		ExFive five = new ExFive();// execute default cons
		five.m1();
	}

}
// Steps of execution
// output will  it will print default values of variable
//Method m1
// 0
// null
// 0.0
//

