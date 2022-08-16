package chapter12_Collection_Framework.Section4_Set_Interface;


import chapter12_Collection_Framework.Section2_Collection_Framework.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동"); // 아이디 중복회원 추가
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember(); // Comparable Interface를 구현하지 않아 에러 발생 >> Member.java에 구현해줌
	}
}
