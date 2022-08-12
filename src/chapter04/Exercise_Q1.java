package chapter04;
// 연습문제
public class Exercise_Q1 {
	public static void main(String[] args) {
		// if 문
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		
		if (operator == '+') {
			System.out.println(num1 + num2);
		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		} else {
			System.out.println("+, -, *, / 중 하나가 아닙니다.");
		}
		
		// switch 문
		int result;
		switch (operator) {
		case '+' : result = num1 + num2;
			break;
		case '-' : result = num1 - num2;
			break;
		case '*' : result = num1 * num2;
			break;
		case '/' : result = num1 / num2;
			break;
		default : result = 0;
		}
		System.out.println("Switch Result: " + result);
	}
}
