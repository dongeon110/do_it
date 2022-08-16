package chapter13_Inner_Class.Section1_Inner_Class;
// Local Inner Class
// 지역변수 처럼 메서드 내부에 클래스를 정의하여 사용하는 것
// 메서드 안에서만 사용가능
class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100; // 지역 변수
		
		
		// local inner class
		class MyRunnable implements Runnable { // 지역 내부 클래스
			int localNum = 100; // 지역 내부 클래스의 인스턴스 변수
			
			@Override
			public void run() {
//				num = 200; // 지역 변수는 상수로 바뀌므로 값을 변경할 수 없어 에러
//				i = 100; // 매개변수도 지역 변수 처럼 상수로 바뀌므로 에러
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}	
		}
		
		return new MyRunnable();
	}
}


public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10); // 메서드 호출
		runner.run();
	}
}
