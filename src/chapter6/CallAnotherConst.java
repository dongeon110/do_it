package chapter6;
// 생성자에서 다른 생성자를 호출하는 this
class Person {
	String name;
	int age;
	
	Person() {
		this("이름 없음", 1); // this를 이용해 아래의 생성자 호출 -> Person("이름 없음", 1) 과 같음
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this; // this 반환 -> 반환은 class Person 형
	}
}
public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName); // 같은 주소
	}
}
