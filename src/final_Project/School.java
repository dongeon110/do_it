package final_Project;

import java.util.ArrayList;

public class School {
	private static School instance = new School();
	
	public static String SCHOOL_NAME = "Good School";
	public ArrayList<Student> studentList = new ArrayList<>();
	public ArrayList<Major> majorList = new ArrayList<>();
	public ArrayList<Subject> subjectList = new ArrayList<>();
	
	private School() {}
	
	// singleton
	public static School getInstance() {
		if (instance == null)
			instance = new School();
		return instance;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	public void addMajor(Major major) {
		majorList.add(major);
	}
}
