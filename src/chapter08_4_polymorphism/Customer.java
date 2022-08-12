package chapter08_4_polymorphism;
// chapter8 package에 있는 customer.java 가져와서 수정
public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	// 생성자
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	
	// 생성자에서만 호출하는 메서드
	private void initCustomer() { // 멤버변수의 초기화
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	
	public int calcPrice(int price) { // 보너스포인트를 적립하고 지불가격을 계산
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	// protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록 get, set 메서드 추가
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
