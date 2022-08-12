package chapter10_interface;
// Exercise Q7
public interface Sort {
	void ascending(int[] a);
	void descending(int[] a);
	default void description() {
		System.out.println("description()");
	}
}
