package chapter3;
// 3장 연습문제 1~3
public class chapter3_exQ1 {
	public static void main(String[] args) {
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge)? 'T' : 'F';
		
		System.out.println(ch);
		
		// Q2
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);
		
		// Q3
		int num2;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
	}
}
