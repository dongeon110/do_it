package chapter6_3;
// Exercise 5
public class ExQ5_Human {
	String humanName;
	int money;
	
	public void buyCoffee(ExQ5_Cafe cafe, ExQ5_Cafe.Americano americano) {
		
		if (money >= americano.price) { 
			money -= americano.price;
			cafe.sellCoffee(americano);
		} else {
			System.out.println("돈이 부족합니다.");
		}
	}
	
	public void buyCoffee(ExQ5_Cafe cafe, ExQ5_Cafe.Latte latte) {
		if (money >= latte.price) {
			money -= latte.price;
			cafe.sellCoffee(latte);
		} else {
			System.out.println("돈이 부족합니다.");
		}
	}
	
	public ExQ5_Human(String humanName, int money) {
		this.humanName = humanName;
		this.money = money;
	}
}
