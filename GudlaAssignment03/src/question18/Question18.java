package question18;

public class Question18 {

	public static void main(String[] args) {
		Thread T = new Thread(() -> System.out.println("Hello, world!"));
		T.start();
		T.start();
	}

}
