package question15;

import java.util.HashMap;

public class Question15 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> hashMap = new HashMap<>();

       
        hashMap.put("Navya", 25);
        hashMap.put("Mahesh", 30);
        hashMap.put("Madhu", 35);

        
        int age = hashMap.get("Mahesh");
        System.out.println("Mahesh age is " + age);
       
        hashMap.remove("Madhu");
      
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }
}

