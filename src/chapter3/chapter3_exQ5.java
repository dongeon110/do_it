package chapter3;

public class chapter3_exQ5 {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 10;
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		// Q6
		int num = 8;
		
		System.out.println(num += 10);
		System.out.println(num -= 10);
		System.out.println(num >>= 2);
		
		
		// Q7
		int num7 = 10;
		int num8 = 20;
		
		int result = (num7 >= 10) ? num8 + 10 : num8 - 10;
		System.out.println(result);
	}
}
