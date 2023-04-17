package question1;

public class Question1 {
	public static void main(String[] args) {
		
		Gen<Integer> myInts = new Gen<Integer>();
		myInts.add(42);
		int myInt = myInts.get();
		System.out.println(myInt);
	}

}
class Gen<T> {
    private T contents;

    public void add(T item) {
        this.contents = item;
    }

    public T get() {
        return contents;
    }
}
