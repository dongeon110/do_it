package chapter11_Class.Section2_String_Class;
// 주소값 비교하기
public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 주소값이 달라 F
		System.out.println(str1.equals(str2)); // 값은 같아 T
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // 상수풀에 저장되어 주소가 같음 T
		System.out.println(str3.equals(str4)); // 값도 당연히 같음 T
	}
}
