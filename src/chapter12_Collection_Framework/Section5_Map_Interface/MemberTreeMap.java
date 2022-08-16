package chapter12_Collection_Framework.Section5_Map_Interface;
// TreeSet 과 마찬가지로 이진 검색 트리로 구현된 TreeMap
// key값으로 정렬하므로 Comparable이나 Comparator 인터페이스를 구현해야함
import java.util.Iterator;
import java.util.TreeMap;

import chapter12_Collection_Framework.Section2_Collection_Framework.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member); // key-value 쌍으로 추가
	}
	
	public boolean removeMember(int memberId) {
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
