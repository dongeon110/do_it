package chapter09_TDD;

public class Player {
	
	private PlayerLevel level;
	
	// 생성자
	public Player() {
		level = new BeginnerLevel();
	}
	
	public void play(int count) {
		level.showLevelMessage();
		level.run();
		for(int i=0; i<count; i++) {
			level.jump();
		}
		level.turn();
	}
	
	// get Level
	public PlayerLevel getPlayerLevel() {
		return level;
	}
	
	// set Level
	public void setPlayerLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
}
