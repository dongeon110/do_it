package chapter13_Inner_Class.Section2_Lambda_Expression;
// 람다식
// 객체 X 함수의 구현과 호출만으로 프로그램을 만들 수 있는 프로그래밍 방식 = 함수형 프로그래밍
// 자바에서 제공하는 함수형 프로그래밍 방식 = 람다식

// 인터페이스를 먼저 만들고 -> 메서드 선언

// 함수형 인터페이스 선언

@FunctionalInterface // Functional Interface Annotation 선언, 명시 -> 메소드 2개 들어가면 에러
public interface MyNumber {
	int getMax(int num1, int num2); // 추상 메서드 선언
}
// TestMyNumber 에서 사용