package chapter04;
// 연습문제 * 다이아 모양
public class Exercise_Q5 {
	public static void main(String[] args) {
		int row;
		int blank;
		int star;
		int i;
		
		for (row=1; row<=4; row++) {
			blank = 4 - row;
			star = 2*row - 1;
			for (i=1; i<=blank; i++) {
				System.out.print(" ");
			}
			for (i=1; i<=star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (row=3; row>=1; row--) {
			blank = 4 - row;
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
