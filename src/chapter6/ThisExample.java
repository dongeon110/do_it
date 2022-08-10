package chapter6;
// 자신의 메모리를 가리키는 this
class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; // bDay.year = year; 와 같음
	}
	
	public void printThis() {
		System.out.print(this); // = System.out.print(bDay);
	}
}
public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}
}
