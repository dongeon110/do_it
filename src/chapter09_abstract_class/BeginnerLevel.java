package chapter09_abstract_class;
// Chapter9-3 템플릿 메서드 응용하기 - 예제 시나리오
public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 초보자 레벨입니다. *****");
	}
}
