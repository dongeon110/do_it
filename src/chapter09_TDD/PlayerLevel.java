package chapter09_TDD;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void showLevelMessage();
	
	public void jump() {
		System.out.println("Jump 할 줄 모름.");
	}
	public void turn() {
		System.out.println("Turn 할 줄 모름.");
	}
	
	
}
