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
	}
}
