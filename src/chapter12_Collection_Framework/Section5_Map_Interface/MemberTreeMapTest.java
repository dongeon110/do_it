package chapter12_Collection_Framework.Section5_Map_Interface;

import chapter12_Collection_Framework.Section2_Collection_Framework.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberSon = new Member(1002, "손민국"); // 회원 아이디 순서 상관없이 추가
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004); // 회원 아이디 (key값)가 1004인 회원 삭제
		memberHashMap.showAllMember();
	}
}
