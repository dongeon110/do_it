package chapter10_interface;
// 정렬은 하지말고 설명만 출력
public class QuickSort implements Sort {
	@Override
	public void ascending(int[] a) {
		System.out.println("QuickSort - ascending");
	}
	
	@Override
	public void descending(int[] a) {
		System.out.println("QuickSort - descending");
	}
	
	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		System.out.println("QuickSort입니다.");
	}
}
