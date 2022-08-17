package chapter13_Inner_Class.Section2_Lambda_Expression;
// 매개변수로 전달하는 람다식
interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Hello Lambda 1"); // 람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다식 구현부 호출
		
		showMyString(lambdaStr); // 메서드의 매개변수로 람다식을 대입한 변수 전달
		
		
		// 반환 값으로 쓰이는 람다식
		PrintString reStr = returnString(); // 변수로 반환받기
		reStr.showString("hello "); // 메서드 호출
	}
	
	
	public static void showMyString(PrintString p) { // 매개변수로 인터페이스형을 받음 PrintString
		p.showString("Hello Lambda 2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}
}
