package chapter11_Class.Section3_Wrapper_Class;
/* 기본 자료형을 감쌌다는 의미의 Wrapper클래스
 * 기본형 -> Wrapper클래스
 * boolean -> Boolean
 * byte -> Byte
 * char -> Character
 * short -> Short
 * int -> Integer
 * long -> Long
 * float -> Float
 * double -> Double
 * 기본형 -> 객체형
 */
public class WrapperTest {
	public static void main(String[] args) {
		Integer iValue = new Integer(100);
		int myValue = iValue.intValue(); // int 값 가져오기
		
		Integer number1 = Integer.valueOf("100");
		Integer number2 = Integer.valueOf(100);
		
		int num = Integer.parseInt("100");
		
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2; // num1 -- num.intValue()로 변환(언박싱) - 객체형 -> 기본형
		Integer num3 = num2; // num2 -- Integer.valueOf(num2)로 변환(오토박싱) - 기본형 -> 객체형
	}
}
