package chapter09_abstract_class;
// 추상클래스 상속받기
public class DeskTop extends Computer { // 추상 클래스를 상속받으려면 추상 클래스이어야 한다.
	// 아니면 추상 메서드를 Override 해서 concrete class로 바꿔버린다.
	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DestTop typing()");
	}
}
