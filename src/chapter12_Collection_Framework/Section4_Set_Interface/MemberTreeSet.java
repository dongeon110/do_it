package chapter12_Collection_Framework.Section4_Set_Interface;
// TreeSet 활용해 회원 관리 프로그램 구현하기
import java.util.Iterator;
import java.util.TreeSet;

import chapter12_Collection_Framework.Section2_Collection_Framework.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) { // TreeSet에 회원을 추가하는 메서드
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) { // TreeSet에서 회원을 삭제하는 메서드
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() { // 회원 전체 출력 메서드
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
