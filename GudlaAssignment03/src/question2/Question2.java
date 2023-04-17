package question2;

public class Question2 {

	public static void main(String[] args) {
		Sp super1 =  new Sp();
		super1.print();
	}
}
class Sp {
	   private void print() {
	      System.out.println("SuperClass");
	   }
}
class Sb extends Sp {
	   private void print() {
	      System.out.println("SubClass");
	   }
}
