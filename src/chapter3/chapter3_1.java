package chapter3;

public class chapter3_1 {
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(+num);
		System.out.println(-num); // -num 을 했지만 num 값 자체가 바뀌지는 않음
		System.out.println(num);
		
		num = -num;
		System.out.println(num);
	}
}
