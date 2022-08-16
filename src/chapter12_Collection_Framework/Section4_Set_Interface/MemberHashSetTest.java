package chapter12_Collection_Framework.Section4_Set_Interface;

import chapter12_Collection_Framework.Section2_Collection_Framework.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동"); // 아이디 중복 회원 추가
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember(); // 아이디는 같지만 다른 객체
	}
}
