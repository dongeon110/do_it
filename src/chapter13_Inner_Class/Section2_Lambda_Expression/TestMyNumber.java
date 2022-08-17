package chapter13_Inner_Class.Section2_Lambda_Expression;
// 람다식 구현과 호출
public class TestMyNumber {
	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y) ? x : y; // 람다식을 인터페이스형 max 변수에 대입
		System.out.println(max.getMax(10, 20));
	}
}
