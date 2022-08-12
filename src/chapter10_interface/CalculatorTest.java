package chapter10_interface;
// 계산기 클래스 실행하기
public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1,  num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		
		calc.description(); // default method
		
		Calculator calc2 = new CompleteCalc();
//		calc2.showInfo();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	}
}

/* CompleteCalc 도 인터페이스, 상위 클래스로 묵시적 형 변환이 가능하다.
 * 하지만, Calc 인터페이스로 변환하면
 * Calc에서 선언한 메서드만 사용가능하고, 추가로 선언한 showInfo 메소드는 사용불가하다.
 */