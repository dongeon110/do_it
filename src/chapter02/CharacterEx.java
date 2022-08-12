package chapter02;
// 문자열 변수에 숫자를 저장한다면
public class CharacterEx {
	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		// char b2 = -66; // 문자열 변수에 음수를 넣으면 에러
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
	}
}
