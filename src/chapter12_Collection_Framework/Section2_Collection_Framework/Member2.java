package chapter12_Collection_Framework.Section2_Collection_Framework;
// 두 매개변수를 비교하는 Comparator Interface를 위한 클래스
import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
	private int memberId;
	private String memberName;
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	@Override
	public int compare(Member2 mem1, Member2 mem2) { // compare() 메서드 재정의, 전달받은 두 매개변수를 비교함.
		return mem1.getMemberId() - mem2.getMemberId();
	}

}


// 하지만 Comparator 보다 Comparable 인터페이스를 더 많이 사용함.