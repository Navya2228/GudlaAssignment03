package question13;

import java.util.ArrayList;
import java.util.Vector;

public class Question13 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("banana");
        vector.add("orange");
        System.out.println("Vector: " + vector);

        // Using ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        System.out.println("ArrayList: " + arrayList);
	}
}
