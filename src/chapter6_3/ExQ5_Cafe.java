package chapter6_3;
// Exercise 5
public class ExQ5_Cafe {
	class Americano {
		int price = 4000;
	}

	class Latte {
		int price = 4500;
	}
	
	int guestCount = 0;
	int money = 0;
	Americano americano = new Americano();
	Latte latte = new Latte();
	
	
	public void sellCoffee(Americano Americano) {
		money += Americano.price;
		guestCount++;
	}
	
	public void sellCoffee(Latte latte) {
		money += latte.price;
		guestCount++;
	}
}
