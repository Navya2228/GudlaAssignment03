package question3;

public class Question3 {
	public static void main(String[] args) {
		Sp super1 =  new Sp();
		super1.get();
	}
}
class Sp {
	   Sp get() {
	      return new Sp();
	   }
	}
class Sb extends Sp {
	   @Override
	   Sb get() {
	      return new Sb();
	   }
}

