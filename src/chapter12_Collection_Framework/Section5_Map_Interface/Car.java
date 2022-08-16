package chapter12_Collection_Framework.Section5_Map_Interface;

public class Car implements Comparable<Car> {
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car car = (Car) obj;
			if (this.name == car.name) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	// 이름 순 정렬
	@Override
	public int compareTo(Car car) {
		return this.name.compareTo(car.name);
	}
}
