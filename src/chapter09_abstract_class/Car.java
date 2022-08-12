package chapter9_abstract_class;
// 템플릿 메서드 - 추상 클래스를 사용하여 구현
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() { // 템플릿 메서드
		startCar();
		drive();
		stop();
		turnOff();
	}
}
