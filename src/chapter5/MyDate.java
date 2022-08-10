package chapter5;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
// 연습문제4
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	// 생성자
	MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	// 각 변수 get, set 메서드
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isValid() {
		ArrayList<Integer> day31month = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
		ArrayList<Integer> day30month = new ArrayList<>(Arrays.asList(4, 6, 9, 11));
		
		if (day31month.contains(this.month)) {
			if (this.day >=1 && this.day <= 31) {
				System.out.println("유효한 날짜입니다.");
				return true;
			} else { 
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
				}
		} else if (day30month.contains(this.month)) {
			if (this.day >=1 && this.day <= 30) { 
				System.out.println("유효한 날짜입니다.");
				return true;
				} else {
					System.out.println("유효하지 않은 날짜입니다.");
					return false;
					}
		} else if (this.month == 2) {
			if (this.day >=1 && this.day <= 28) {
				System.out.println("유효한 날짜입니다.");
				return true;
			} else { 
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
				}
		} else { 
			System.out.println("유효하지 않은 날짜입니다.");
			return false;
			}
	}

}
