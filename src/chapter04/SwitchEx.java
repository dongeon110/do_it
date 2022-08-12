package chapter04;
// switch - case 예제
public class SwitchEx {
	public static void main(String[] args) {
		int floor = 5;
		String resident;
		
		switch (floor) {
		case 1 : resident = "약국";
			break;
		case 2 : resident = "정형외과";
			break;
		case 3 : resident = "피부과";
			break;
		case 4 : resident = "치과";
			break;
		case 5 : resident = "헬스 클럽";
			break;
		default : resident = "없는 층";
		}
		
		System.out.println(floor + "층 " + resident + "입니다");
	}
}
