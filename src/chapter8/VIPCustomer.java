package chapter8;
// 상속
public class VIPCustomer extends Customer {
	private int agentID; // VIP 전용 상담원 ID
	double saleRatio; // VIP 전용 할인율
	
	
	@Override // 이 메서드는 재정의된 메서드입니다 라고 명확히 알려주는 역할
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	
	// 생성자
	public VIPCustomer() {
		// super(); // 컴파일러가 자동으로 추가. 상위 Customer의 디폴트 생성자 호출.
		// 만약, 디폴트 생성자를 정의하지 않고 다른 생성자를 정의한다면 super()에서 에러 발생
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCustomer 생성자 호출");
	}
	
	public VIPCustomer(int customerID, String customerName, int agendID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	
	// 상속클래스 Only
	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원은 " + agentID + "입니다."; // 상위 클래스의 메서드를 호출하여 구현
	}
}
