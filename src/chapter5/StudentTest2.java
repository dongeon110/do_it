package chapter5;
// 참조 값 출력
public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";
		
		Student student2 = new Student();
		student2.studentName = "안승연";
		
		System.out.println(student1);
		System.out.println(student2); // 출력되는 값은 클래스이름@주소값
	}
}
