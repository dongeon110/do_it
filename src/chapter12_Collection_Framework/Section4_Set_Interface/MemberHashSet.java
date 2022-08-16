package chapter12_Collection_Framework.Section4_Set_Interface;

import java.util.HashSet;
import java.util.Iterator;

import chapter12_Collection_Framework.Section2_Collection_Framework.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) { // Iterator를 활용해 순회
		Iterator<Member> ir = hashSet.iterator();
		
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member); // 매개변수로 받은 회원 아이디에 해당하는 회원 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	
	public void showAllMember() { // 모든 회원 출력
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
