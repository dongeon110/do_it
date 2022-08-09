package chapter4;

public class ifExample2 {
	public static void main(String[] args) {
		int age = 95;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중고등학생입니다.");
		} else if (age >= 60) {
			charge = 0;
		System.out.println("경로우대입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원입니다.");
		
		
		
		// 100page 나 혼자 코딩
		int score = 89;
		char grade;
		
		if (score > 100) {
			grade = 'F';
		} else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
	}
}
