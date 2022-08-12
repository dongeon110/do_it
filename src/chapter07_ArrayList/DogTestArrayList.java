package chapter07_ArrayList;
// Exercise Q5
import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogHouse = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			dogHouse.add(new Dog("name"+(i+1), 1+i+"종"));
		}
		
		for(Dog dog:dogHouse) {
			System.out.println(dog.showDogInfo());
		}
	}
}
