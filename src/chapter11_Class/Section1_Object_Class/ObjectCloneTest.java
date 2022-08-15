package chapter11_Class.Section1_Object_Class;
// clone() Method로 인스턴스 복제하기
class Point {
	int x;
	int y;
	
	// 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x = " + x + ", " + "y = " + y;
	}
}

class Circle implements Cloneable {
	Point point;
	int radius;
	
	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고, " + "반지름은 " + radius + "입니다";
	}
	
	@Override // clone 메소드를 사용할 때 발생할 수 있는 오류를 예외처리함
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
