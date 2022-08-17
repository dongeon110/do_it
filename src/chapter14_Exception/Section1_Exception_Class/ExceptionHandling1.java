package chapter14_Exception.Section1_Exception_Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e); // 예외클래스의 toString() 메서드 호출 (e.toString())
		}
		System.out.println("여기도 수행됩니다."); // 정상 출력
	}
}
