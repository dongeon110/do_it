package chapter02;
// 상수 변수
public class Constant {
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// MIN_NUM = 50; // 상수는 값을 못 바꾼다.
		
		final int MY_AGE = 22;
		System.out.println(MY_AGE);
	}
}
