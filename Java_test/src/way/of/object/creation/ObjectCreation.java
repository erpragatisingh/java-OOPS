package way.of.object.creation;
// format of object creation
public class ObjectCreation {
	
	public ObjectCreation() {
		System.out.println("0 arg constructor");
	}
	public ObjectCreation(int a) {
		System.out.println("1 arg constructor");

	}
	public ObjectCreation(int a, int b) {
		System.out.println("2 arg constructor");

	}
	public ObjectCreation(int a,int b,int c) {
		System.out.println("3 arg constructor");

	}
	

	public static void main(String[] args) {
   //       Named approach for create object
		ObjectCreation creation =   new ObjectCreation();
		ObjectCreation creation3 =  new ObjectCreation(37);
		ObjectCreation creation1 =  new ObjectCreation(12,34);
		ObjectCreation creation2 =  new ObjectCreation(34,56,78);
		
		// name less approach for create object
		
		   new ObjectCreation();
           new ObjectCreation(37);
		   new ObjectCreation(12,34);
		   new ObjectCreation(34,56,78);
	}

}
