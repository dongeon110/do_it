package chapter14_Exception.Section4_Custom_Exception;
// 사용자 정의 예외 구현하기
public class IDFormatException extends Exception {
	public IDFormatException(String message) { // 생성자의 매개변수로 예외 상황 메세지를 받음
		super(message);
	}
}
