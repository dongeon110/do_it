package final_Project;

import java.util.ArrayList;

import final_Project.*;

public class GenerateGradeReport {
	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름 | 학번 |필수과목| 점수 \n";
	public static final String LINE = "-----------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.subjectList;
		
		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
	}
	
	
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.subjectName);
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	
	public void makeBody(Subject subject) {
		ArrayList<Student> studentList = subject.studentList;
		
		for (int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.studentName);
			buffer.append(" | ");
			buffer.append(student.studentId);
			buffer.append(" | ");
			buffer.append(student.major.majorSubject.subjectId + "\t");
			buffer.append(" | ");
			
			getScoreGrade(student, subject.subjectId);
			
			buffer.append(" \n");
			buffer.append(LINE);
		}
	}
	
	
	public void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.scoreList;
		int majorId = student.major.majorSubject.subjectId;
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()}; // 학점 평가 클래스
		
		for (int i=0; i<scoreList.size(); i++) {
			Score score = scoreList.get(i);
			if(score.subject.subjectId == subjectId) { // 학점 산출할 과목
				String grade;
				
				
				if(score.subject.gradeType == Define.PF_TYPE) {
					grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.point);
				} else { 
					if(score.subject.subjectId == majorId)
						grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.point);
					else 
						grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.point);
				}
				buffer.append(score.point);
				buffer.append(" | ");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}
	
	
	public void makeFooter() {
		buffer.append("\n");
	}
}
