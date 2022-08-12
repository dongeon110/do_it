package chapter06;
// 6-2 객체 간 협력 student 클래스
public class Student {
	public String studentName;
	public int grade; // 학년
	public int money; // 학생이 가지고 있는 돈
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi, int money) {
		taxi.take(money);
		this.money -= money;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
}
