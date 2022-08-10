package chapter6_3;
// Student1.java test (학번 확인하기)
public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + "학번 : " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);
		
		System.out.println(Student1.serialNum); // static 변수는 클래스 이름으로 참조가 가능하다.
	}
}
// static 변수는 클래스를 선언할 때 특정 메모리에 저장되어 모든 인스턴스가 공유하는 변수