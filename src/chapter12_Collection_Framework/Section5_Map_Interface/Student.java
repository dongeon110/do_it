package chapter12_Collection_Framework.Section5_Map_Interface;

public class Student implements Comparable<Student> {
	int studentId;
	String studentName;
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	Student(String studentIdStr, String studentName) {
		this.studentName = studentName;
		boolean isNumeric = studentIdStr.chars().allMatch(Character::isDigit); // 문자열이 숫자인지 확인
		if (isNumeric)
			this.studentId = Integer.parseInt(studentIdStr);
		else
			System.out.println("ID가 숫자로된 문자열이 아닙니다.");
	}
	
	@Override
	public String toString() {
		return studentId + ":" + studentName;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (this.studentId == student.studentId) // memberId 가 같으면 같은 객체로 equals 메소드 Overriding
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int compareTo(Student student) {
		return (this.studentId - student.studentId); // *(-1) 하여 반환값을 음수로 만들면 TreeSet 내림차순 정렬 가능
	}
}
