package chapter6_3;
// Exercise 6
public class ExQ6_CardCompany {
	
	private static int serial = 1000;
	
	private ExQ6_CardCompany() {}
	private static ExQ6_CardCompany cardCompany = new ExQ6_CardCompany();
	
	public final ExQ6_Card createCard(String owner) {
		int cardnum = ++serial;
		ExQ6_Card newCard = new ExQ6_Card(owner, cardnum);
		return newCard;
	}
	
	public static ExQ6_CardCompany getInstance() {
		if (cardCompany == null) {
			cardCompany = new ExQ6_CardCompany();
		}
		return cardCompany;
	}
}
