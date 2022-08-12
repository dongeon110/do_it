package chapter05;
// 생성자 테스트
public class PersonTest {
	public static void main(String[] args) {
		Person personLee = new Person(); // 생성자
		personLee.name = "리씨";
		System.out.println(personLee.name);
		
		String kikgName = "나혼자코딩_157page_kikg이름";
		float testKi = 180;
		float testKg = 80;
		
		Person kikg = new Person(kikgName, testKi, testKg);
		System.out.println("Name : " + kikg.name);
		System.out.println("Height : " + kikg.height + ", Weight : " + kikg.weight);
	}
}
