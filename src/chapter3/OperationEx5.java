package chapter3;
// 비트 이동 연산자
public class OperationEx5 {
	public static void main(String[] args) {
		int num = 0B00000101; // 5를 8비트 2진수로 나타냄
		
		System.out.println(num << 2); // 20
		System.out.println(num >> 2); // 1
		System.out.println(num >>> 2); // 1
		
		System.out.println(num); // 5
	}
}
