package final_Project;

import java.util.ArrayList;

public class Major {
	public int majorCode;
	public String majorName;
	public Subject majorSubject;
	public ArrayList<Student> studentList;
	
	public Major(int majorCode, String majorName, Subject majorSubject) {
		this.majorCode = majorCode;
		this.majorName = majorName;
		this.majorSubject = majorSubject;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
}
