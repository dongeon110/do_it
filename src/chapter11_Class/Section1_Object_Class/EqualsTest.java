package chapter11_Class.Section1_Object_Class;
// equals() Method - 같은 인스턴스 (같은 메모리)
class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + ", " + studentName;
	}
	
	@Override
	public boolean equals(Object obj) { // equals Method 재정의
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(this.studentId == std.studentId) // 학번이 같으면 true 반환
				return true;
			else return false;
		}
		return false;
	}
	
	@Override // hashCode() 재정의
	public int hashCode() {
		return studentId; // 학번 반환
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		// 동일한 주소의 두 인스턴스 피교
		if(studentLee == studentLee2)
			System.out.println("Lee == Lee2");
		else
			System.out.println("Lee != Lee2");
		// equals() Method
		if(studentLee.equals(studentLee2))
			System.out.println("Lee == Lee2");
		else
			System.out.println("Lee != Lee2");
		
		
		// 동일인 이지만 인스턴스 주소가 다름
		if(studentLee == studentSang)
			System.out.println("Lee == Sang");
		else
			System.out.println("Lee != Sang");
		// equals() Method
		if(studentLee.equals(studentSang))
			System.out.println("Lee == Sang");
		else
			System.out.println("Lee != Sang");
		
		
		// hashCode
		System.out.println("studentLee hashCode : " + studentLee.hashCode());
		System.out.println("studentSang hashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee 실제 주소 값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang 실제 주소 값 : " + System.identityHashCode(studentSang)); // 실제 메모리 값은 다른 모습
	}
}
