package question14;

import java.util.ArrayList;

public class Question14b {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		synchronized(list) {
		    list.add("item");
		}

	}

}
