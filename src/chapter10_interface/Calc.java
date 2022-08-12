package chapter10_interface;
// 인터페이스는 추상메서드 와 상수로만 이루어짐 -> 인스턴스 생성 불가
// default method, static method
public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999; // 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2); // 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상메서드로 변환됨
	
	default void description() { // default method
		System.out.println("정수 계산기를 구현합니다");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i:arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	}
}
