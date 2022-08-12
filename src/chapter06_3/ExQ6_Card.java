package chapter06_3;
// Exercise 6
public final class ExQ6_Card {
	private String owner;
	private int cardNum;
	
	public ExQ6_Card(String owner, int cardNum) {
		this.owner = owner;
		this.cardNum = cardNum;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
}
