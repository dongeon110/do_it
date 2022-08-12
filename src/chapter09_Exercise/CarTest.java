package chapter09_Exercise;
// exercise Q4, 5 실행
import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car:carList) {
			car.run();
			System.out.println("=================================");
		}
	}
}
