package chapter7_ArrayList;
// Dog class 사용
public class Exercise_Q4 {
	public static void main(String[] args) {
		Dog[] dogHouse = new Dog[5];
		
		for(int i=0; i<dogHouse.length; i++) {
			dogHouse[i] = new Dog("Name"+i, i+"종");
		}
		
		// 그냥 for문 출력
		for(int i=0; i<dogHouse.length; i++) {
			System.out.println(dogHouse[i].showDogInfo());
		}
		
		System.out.println("======================");
		// 향상된 for문
		for(Dog dog:dogHouse) {
			System.out.println(dog.showDogInfo());
		}		
	}
}
