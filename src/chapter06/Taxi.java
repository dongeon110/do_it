package chapter06;
// 6-2 객체 간 협력 - 예제 - taxi 추가해보기 180p
public class Taxi {
	int taxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("Taxi " + taxiNumber + "의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다.");
	}
}
