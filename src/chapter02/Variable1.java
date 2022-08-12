package chapter02;
// 변수 형 변환
public class Variable1 {
	public static void main (String[] args) {
		long level = 12345678900l;
		System.out.println(level);
		
		char ch1 = 'Z';
		System.out.println(ch1);
		System.out.println((int)ch1); // 정수값 아스키코드 출력
		
		char ch2 = 38; // B
		System.out.println(ch2); // 정수값에 해당하는 문자 출력
		
		int ch3 = 97;
		System.out.println(ch3);
		System.out.println((char)ch3);
	}
}
