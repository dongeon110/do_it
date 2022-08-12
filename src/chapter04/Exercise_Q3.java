package chapter04;
// 구구단 단보다 곱하는 수가 작거나 같은 경우까지만 출력
public class Exercise_Q3 {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for (dan=2; dan<=9; dan++) {
			for (times=2; times<=9; times++) {
				if (dan < times) {
					break;
				} else {
				System.out.println(dan + " X " + times + " = " + dan*times);
				}
			}
			System.out.println();
		}
	}
}
