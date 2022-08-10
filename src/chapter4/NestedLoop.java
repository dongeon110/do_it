package chapter4;
// 다중 for문 구구단
public class NestedLoop {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=3; dan<=7; dan++) {
			for(times=2; times<=9; times++) {
				System.out.println(dan + "*" + times + "=" + dan*times);
			}
			System.out.println();
		}
	}
}
