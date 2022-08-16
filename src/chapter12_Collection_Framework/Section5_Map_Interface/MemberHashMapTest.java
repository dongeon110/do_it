package chapter12_Collection_Framework.Section5_Map_Interface;

import chapter12_Collection_Framework.Section2_Collection_Framework.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}

/* HashMap vs Hashtable
 * Hashtable의 경우 Vector처럼 멀티스레드를 위한 동기화를 제공
 * 멀티스레드가 아니라면 HashMap을 쓸 것.
 */
