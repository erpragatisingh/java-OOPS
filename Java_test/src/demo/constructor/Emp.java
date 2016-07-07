package demo.constructor;

public class Emp {
  String name;
  int sal;
	public Emp(String name , int sal) {// local variable
		// convertion of local variable to instance variable
		this.name=name;
		this.sal=sal;
		
	}

	void display(){
		System.out.println("Emap name is "+name);
		System.out.println("Emap Sal is "+sal);
	}
	
	public static void main(String[] args) {
		
		Emp emp = new Emp("Pragati", 20000);
		emp.display();
		Emp emp2 = new Emp("Gaganjeet",2980);
		emp2.display();
		

	}

}
// Problame both emp have same val but  it should be diff
//		Emap name is Pragati
//		Emap Sal is 67
//		Emap name is Pragati
//		Emap Sal is 67

// To Silve this problame use constructor 
