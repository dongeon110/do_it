package chapter11_Class.Section4_Class_Class;
// newInstance는 항상 Object를 반환하므로 객체형으로 형변환해야함
public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("chapter11_Class.Section4_Class_Class.Person"); // 동적로딩 - 프로그램 실행 이후 클래스의 로딩이 필요한 경우 Class.forName을 통해 동적 로딩이 가능
		// 동적로딩은 문자열로 클래스를 받기 때문에 에러 찾기 힘듬
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}
}
