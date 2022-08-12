package chapter09_abstract_class;
// MyNoteBook // NoteBook 에서 override 안하고 하나 남은 추상 메서드를 override 마저 해줬기 때문에 추상클래스로 만들지 않아도 됨.
public class MyNoteBook extends NoteBook {
	
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}
}
