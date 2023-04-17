package question20;

public class Question20 {

	public static void main(String args[]) throws InterruptedException {
		Thread thread = new Thread();//new
		thread.start();	//runnable 
		Thread t2 = new Thread(() -> {});
		t2.start();//running
		Object obj = new Object();
		synchronized(obj) {	    }//blocked
		
		synchronized(obj) {
		    obj.wait();//waiting
		}
		Thread t3 = new Thread(() -> {});
		t3.start();
		t3.join();//terminated

	}
}
