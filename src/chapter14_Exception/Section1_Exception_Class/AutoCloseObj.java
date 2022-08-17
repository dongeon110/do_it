package chapter14_Exception.Section1_Exception_Class;

public class AutoCloseObj implements AutoCloseable {
	@Override
	public void close() throws Exception { // close() 메서드 구현 // 여기에는 close 메서드가 제대로 호출되는지 알아보기 위해 출력문만 남김
		System.out.println("리소스가 close() 되었습니다.");
	}
}
