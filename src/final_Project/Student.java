package final_Project;

import java.util.ArrayList;

public class Student {
	public int studentId; // 학번
	public String studentName; // 이름
	public Major major; // 전공
	public ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(int studentId, String studentName, Major major) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.major = major;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}

}
