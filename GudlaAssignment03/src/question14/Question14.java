package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question14{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		List<String> synchronizedList = Collections.synchronizedList(list);
		System.out.println(list);
		System.out.println(synchronizedList);		
	}
}

