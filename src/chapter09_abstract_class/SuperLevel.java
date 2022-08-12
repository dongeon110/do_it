package chapter09_abstract_class;
// Chapter9-3 템플릿 메서드 응용하기 - 예제 시나리오
public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다");
	}
	
	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
	}
	
	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. *****");
	}
}
