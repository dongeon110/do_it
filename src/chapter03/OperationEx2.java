package chapter03;
// 증가, 감소 연산자
public class OperationEx2 {
	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = gameScore++;
		System.out.println(lastScore1);
//		System.out.println(gameScore);
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);
		
		boolean a = true || false; // || = or
		System.out.println(a);
	}
}
