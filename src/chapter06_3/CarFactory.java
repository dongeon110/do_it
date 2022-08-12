package chapter06_3;
// 6-4 196page 싱글톤으로 클래스 구현
public class CarFactory {
	
	private static int serial = 10000;
	
	private static CarFactory instance = new CarFactory(); // 2. 클래스 내부에서 static으로 유일한 인스턴스 생성
	private CarFactory() {} // 1. 생성자를 private 로 생성 (클래스 내부에서만 제어 가능)
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance; // 3. 유일한 인스턴스 반환
	}
	
	public Car createCar() {
		serial++;
		Car car = new Car(serial);
		return car;
	}
}
