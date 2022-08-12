package chapter09_abstract_class;
// notebook 클래스 구현 // 추상메서드 2개중 1개만 override했기 떄문에 추상 클래스로 구현
public abstract class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}
}
