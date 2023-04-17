package question17;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Question17b {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("Navya", 25);
		map.put("Mahesh", 30);
		map.put("Madhu", 35);
		Iterator<Integer> iterator = map.values().iterator();
		while (iterator.hasNext()) {
		    Integer age = iterator.next();
		    map.put("Laxmi", 40);
		}
		System.out.println(map);
	}

}
