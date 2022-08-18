package final_Project;

import final_Project.*;

public class TestMain {
	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	Major koreanMajor;
	Major mathMajor;
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}
	
	public void createSubject() {
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		dance = new Subject("댄스", Define.DANCE);
		
		dance.gradeType = Define.PF_TYPE;
		
		koreanMajor = new Major(Define.KOREAN_MAJOR_ID, "국어과", korean);
		mathMajor = new Major(Define.MATH_MAJOR_ID, "수학과", math);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addMajor(koreanMajor);
		goodSchool.addMajor(mathMajor);
		
		goodSchool.addSubject(dance);
	}
	
	
	public void createStudent() {
		Student student1 = new Student(181213, "안성원", koreanMajor);
		Student student2 = new Student(181518, "오태훈", mathMajor);
		Student student3 = new Student(171230, "이동호", koreanMajor);
		Student student4 = new Student(171225, "조성욱", koreanMajor);
		Student student5 = new Student(171590, "최태형", mathMajor);
		
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		dance.register(student1);
		dance.register(student2);
		dance.register(student3);
		
		
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		addScoreForStudent(student1, dance, 95);
		
		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);
		addScoreForStudent(student2, dance, 85);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student3, dance, 55);
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);
		
		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);
		
		
	}
	
	
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.studentId, subject, point);
		student.addSubjectScore(score);
	}
}
