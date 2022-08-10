package chapter4;
// 연습문제 구구단 짝수단
public class Exercise_Q2 {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			if(dan%2 == 1) {
				continue;
			}
			for (times=2; times<=9; times++) {
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
			System.out.println();
		}
	}
}
