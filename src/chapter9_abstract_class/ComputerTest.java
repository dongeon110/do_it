package chapter9_abstract_class;
// 추상 클래스 테스트하기
public class ComputerTest {
	public static void main(String[] args) {
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		// 추상 클래스는 인스턴스로 생성할 수 없다.
		
		/*
		 * 추상 클래스는 왜 쓸까?
		 * 
		 * 하위 클래스에서 공통으로 사용할 구현 코드를
		 * 하위 클래스에서 재정의, 구현 하도록 하기 위해서
		 * 
		 */
	}
}
