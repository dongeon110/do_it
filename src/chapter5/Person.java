package chapter5;
// constructor(생성자)
public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {} // 자바 컴파일러가 자동으로 제공하는 디폴트 생성자
	public Person(String pname) {
		name = pname;
	} // 생성자를 만들 때, String pname 입력변수로 만드니, 입력변수가 없으면 에러 뜸 (PersonTest.java line:5)
	
	// 디폴트 생성자는 다른 생성자 만들면 생성 안됨.
	// 그래서 직접 생성해주면 입력 변수 없어도 에러 안뜸
	
	public Person(String pname, float ki, float kg) {
		name = pname;
		height = ki;
		weight = kg;
	}
}
