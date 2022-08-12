package chapter09_abstract_class;
// PlayerLevel class
public abstract class PlayerLevel {
	public abstract void run();
	public void jump() {
		System.out.println("Jump할 줄 모르지롱");
	}
	public void turn() {
		System.out.println("Turn할 줄 모르지롱");
	}
	public void showLevelMessage() {
		System.out.println("***** 레벨이 없습니다. *****");
	}
	
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
