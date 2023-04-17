package question24;

public class Question24 {
	 public static void main(String[] args) {
	        Object object1 = new Object();
	        Object object2 = new Object();	        
	        object1 = null;
	        object2 = null;
	        System.gc();
	    }
}
