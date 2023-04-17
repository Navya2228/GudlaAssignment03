package question5;

public class Question5 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" world");
		System.out.println(sb);  // Output: "Hello world"

		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append(" world");
		System.out.println(sbf);  // Output: "Hello world"
	}
}
