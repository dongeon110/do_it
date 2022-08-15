package chapter11_Class.Section2_String_Class;
// StringBuffer, StringBuilder는 내부에 변경 가능한 char[] 변수를 가짐

/* StringBuffer 클래스는 문자열이 안전하게 변경되도록 보장,
 * StringBuilder는 그렇지 않음
 * 
 * 따로 스레드를 생성하는 프로그램이 아니라면 StringBuilder가 실행속도 좀 더 빠름.
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr)); // 인스턴스가 처음 생성되었을 때 주소
		
		StringBuilder buffer = new StringBuilder(javaStr); // String 으로부터 StringBuilder 생성
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString(); // String으로 반환
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
	}
}
