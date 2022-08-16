package chapter12_Collection_Framework.Section2_Collection_Framework;
// collection 패키지 하위에 프로그램 전반에서 공통으로 사용할 멤버 클래스
public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	
	// HashSet 활용하기 위한 메소드 재정의
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.memberId == member.memberId) // memberId 가 같으면 같은 객체로 equals 메소드 Overriding
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
//		return (this.memberId - member.memberId); // *(-1) 하여 반환값을 음수로 만들면 TreeSet 내림차순 정렬 가능
		return this.memberName.compareTo(member.memberName); // String 클래스에 compareTo()정렬을 활용해 이름순으로 정렬
	}
	
}
