package chapter3;
// 산술 연산자
public class OperationEx1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 83;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
	}
}
