package question4;

public class Question4 {

	public static void main(String[] args) {
		 SuperClass.print();  // Output: "Hello from SuperClass"
	      SubClass.print();    // Output: "Hello from SubClass"
	      SuperClass obj = new SubClass();
	      obj.print();  
	      
	      SP obj = new SB();
	      obj.print();

	}
}

//Static
class SuperClass {
	   public static void print() {
	      System.out.println("Hello from SuperClass");
	   }
	}
	class SubClass extends SuperClass {
	   public static void print() {
	      System.out.println("Hello from SubClass");
	   }
	}

//Private
class SP {
	private void print() {
		 System.out.println("Hello from SP");
	}
}

class SB extends SP {
	private void print() {
		      System.out.println("Hello from SB");
		   }
}



