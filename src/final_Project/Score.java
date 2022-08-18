package final_Project;

public class Score {
	int studentId;
	Subject subject;
	int point;
	
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	
	
	public String toString() {
		return "학번 : " + studentId + ", " + subject.subjectName + " : " + point;
	}
}
