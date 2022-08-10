package chapter6_3;
// Exercise 5
public class ExQ5_Test {
	public static void main(String[] args) {
		ExQ5_Human humanKim = new ExQ5_Human("Kim", 40000);
		ExQ5_Human humanLee = new ExQ5_Human("Lee", 50000);
		
		ExQ5_Cafe starDaBang = new ExQ5_Cafe();
		
		humanKim.buyCoffee(starDaBang, starDaBang.americano);
		humanLee.buyCoffee(starDaBang, starDaBang.latte);
		
		System.out.println("Kim money : " + humanKim.money);
		System.out.println("Lee money : " + humanLee.money);
		System.out.println("별다방 money : " + starDaBang.money);
		System.out.println("별다방 guestCount : " + starDaBang.guestCount);
	}
}
