package chapter09_abstract_class;
// Chapter 9-3 템플릿 메서드 응용하기 - 예제 시나리오
public class Player {
	
	private PlayerLevel level; // 플레이어가 가지는 level변수
	
	// 생성자
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
