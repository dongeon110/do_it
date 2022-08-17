package chapter05.test;

import chapter05.Student;

// 인스턴트 여러개 생성하기
public class StudentTest {
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName()); // 앞에 있는 studentAhn 변수를 "참조 변수"라고 함
		
		Student student2 = new Student();
		student2.studentName = "안연수";
		System.out.println(student2.getStudentName());
	}
}
