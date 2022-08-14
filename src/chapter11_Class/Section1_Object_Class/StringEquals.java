package chapter11_Class.Section1_Object_Class;
// String과 Integer의 equals() Method
public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // F = 같은 주소 -> F
		System.out.println(str1.equals(str2)); // T = 같은 문자열 -> T
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2); // F
		System.out.println(i1.equals(i2)); // T
	}
}
