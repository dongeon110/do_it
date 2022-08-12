package chapter05;
// private변수에 set, get으로 접근하기
public class StudentPrivatedTest {
	public static void main(String[] args) {
		StudentPrivated studentLee = new StudentPrivated();
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}

/* public 대신 private로 선언하면
 * 외부 클래스에서 사용할 때 값을 마음대로 넣을 수 있음.
 * private로 선언하면 오류를 제한 할 수 있음.
 * 
 * 예컨대, 날짜 정하는 클래스에서 month, day, year를 public으로 선언하면
 * 2월 28일 까지가 아닌 2월 31일도 설정 가능함.
 * 
 * 하지만 set함수에서 입력할 수 있는 값을 제한시켜버리고
 * private를 사용하면
 * 2월 31일 같은 날짜는 입력 할 수 없음. */


/* 접근제어자 종류 : 접근 가능 범위
 * public : 외부 클래스 어디서나
 * protected : 같은 패키지 내부, 상속 관계의 클래스
 * 없음 : 같은 패키지 내부
 * private : 같은 클래스 내부 */
