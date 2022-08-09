package chapter3;

public class OperationEx4 {
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		
		// 비트연산자
		int num = -5;
		System.out.println(num >>> 2);
		System.out.println(num);
	}
}
