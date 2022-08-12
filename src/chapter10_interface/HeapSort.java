package chapter10_interface;

public class HeapSort implements Sort {
	
	@Override
	public void ascending(int[] a) {
		System.out.println("HeapSort - ascending");
	}
	
	@Override
	public void descending(int[] a) {
		System.out.println("HeapSort - descending");
	}
	
	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("HeapSort입니다.");
	}
}
