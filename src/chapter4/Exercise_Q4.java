package chapter4;
// 연습문제 * 산모양
public class Exercise_Q4 {
	public static void main(String[] args) {
		
		int row;
		int blank;
		int star;
		int i;
		
		for (row=1; row<=4; row++) {
			blank = 4-row;
			star = 2*row - 1;
			for (i=1; i<=blank; i++) {
				System.out.print(" ");
			}
			for (i=1; i<=star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
