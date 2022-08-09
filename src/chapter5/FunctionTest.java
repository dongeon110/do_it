package chapter5;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		int min = minus(num1, num2);
		int mul = multiply(num1, num2);
		float div = divide(num1, num2);
		
		System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다.");
		System.out.println(num1 + " - " + num2 + " = " + min + " 입니다.");
		System.out.println(num1 + " X " + num2 + " = " + mul + " 입니다.");
		System.out.println(num1 + " / " + num2 + " = " + div + " 입니다.");
		
	}
	
	public static int add (int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int minus (int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int multiply (int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static float divide (int n1, int n2) {
		float dn1 = n1 * 1.0f;
		float dn2 = n2 * 1.0f;
		float result = dn1 / dn2;
		return result;
	}
	
	
}