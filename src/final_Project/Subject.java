package final_Project;

import java.util.ArrayList;
import final_Project.Define; // 프로그램 전반에서 사용하는 상수 클래스 

public class Subject {
	public int subjectId;
	public String subjectName;
	public int gradeType; // 학점 평가 정책
	
	public ArrayList<Student> studentList = new ArrayList<Student>();
	
	// 생성자
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
	}
	
	// 수강신청 메서드
	public void register(Student student) {
		studentList.add(student);
	}
	
}
