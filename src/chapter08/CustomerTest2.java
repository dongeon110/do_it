package chapter08;
// 상속에서 클래스 생성 과정
public class CustomerTest2 {
	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer(); // VIPCustomer 생성자를 호출했더니 Customer생성자가 먼저 생기고 그 안에 VIP생성자가 생성되었다.
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println("==========================");
		VIPCustomer customerLee = new VIPCustomer(11111, "이순신", 11112);
		customerLee.bonusPoint = 22222;
		System.out.println(customerLee.showCustomerInfo());
	}
}
