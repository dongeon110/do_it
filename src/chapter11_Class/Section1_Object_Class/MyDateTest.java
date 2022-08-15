package chapter11_Class.Section1_Object_Class;
// equals 값이 일치하면 true가 되게 재정의 하기
class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate mdt = (MyDate) obj;
			if (this.day == mdt.day && this.month == mdt.month && this.year == mdt.year)
				return true;
			else return false;
		}
		return false;
	}
	
}

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println(date1.equals(date2));
	}
}
