package chapter04;
// for문 예제
public class ForExample2 {
	public static void main(String[] args) {
		int i;
		String a = "";
		
		for(i=1; i<=10; i++) {
			a += "안녕하세요" + i;
			if(i != 10) {
				a += ", ";
			} else {
				a += "!";
			}
		}
		
		System.out.println(a);
	}
}
