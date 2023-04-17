package question6;

public class Question6 {
	public static void main(String[] args) {
		String s = "Hello";
		s = s + " world";
		System.out.println(s);  // Output: "Hello world"

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" world");
		System.out.println(sb);  // Output: "Hello world"
	}
}
