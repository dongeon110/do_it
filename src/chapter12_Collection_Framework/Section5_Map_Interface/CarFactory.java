package chapter12_Collection_Framework.Section5_Map_Interface;

import java.util.HashMap;

public class CarFactory {
	private HashMap<String, Car> carHashMap = new HashMap<>();
	
	// 중복 이름 있는지 boolean
	private boolean containCar(String carName) {
		if (carHashMap.containsKey(carName)) { // 존재하면 true
			return true;
		}
		return false;
	}
	
	private void addCar(Car car) {
		carHashMap.put(car.name, car);
	}
	
	public Car createCar(String carName) {
		if (!containCar(carName)) {
			Car car = new Car(carName);
			addCar(car);
		}
		return carHashMap.get(carName);
	}
	
	// Singleton
	private CarFactory() {}
	private static CarFactory instance = new CarFactory();
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	
	
	
}
