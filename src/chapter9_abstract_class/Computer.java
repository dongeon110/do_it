package chapter9_abstract_class;
// 추상클래스
public abstract class Computer { // 추상 메서드가 둘었으면 클래스도 추상 클래스로 만들기
	public abstract void display(); // 추상 메서드는 {} 가 없고 ;로 바로 선언
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
