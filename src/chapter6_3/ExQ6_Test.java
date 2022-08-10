package chapter6_3;
// Exercise 6
public class ExQ6_Test {
	public static void main(String[] args) {
		ExQ6_CardCompany company = ExQ6_CardCompany.getInstance();
		
		ExQ6_Card card1 = company.createCard("철수");
		ExQ6_Card card2 = company.createCard("영희");
		ExQ6_Card card3 = company.createCard("바둑이");
		ExQ6_Card card4 = company.createCard("철수");
		
		System.out.println(card1.getCardNum() + "의 오너 : " + card1.getOwner());
		System.out.println(card2.getCardNum() + "의 오너 : " + card2.getOwner());
		System.out.println(card3.getCardNum() + "의 오너 : " + card3.getOwner());
		System.out.println(card4.getCardNum() + "의 오너 : " + card4.getOwner());
	}
}
