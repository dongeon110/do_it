package chapter10_interface;

public class BubbleSort implements Sort {
	
	@Override
	public void ascending(int[] a) {
		System.out.println("BubbleSort - ascending");
	}
	
	@Override
	public void descending(int[] a) {
		System.out.print("BubbleSort - descending");
	}
	
	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("BubbleSort");
	}
}
