package question23;

public class Question23 {

	public static void main(String[] args) {
		ImmutableClass Ic = new ImmutableClass(10);
		System.out.println(Ic.add(20));
	}

}

final class ImmutableClass {
    private final int value;

    public ImmutableClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableClass add(int valueToAdd) {
        return new ImmutableClass(this.value + valueToAdd);
    }
}

