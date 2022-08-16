package chapter12_Collection_Framework.Section5_Map_Interface;
// Map Interface는 자료를 쌍으로 관리하는 데 필요한 메서드가 정의되어 있음.
// key-value 쌍으로 이루어진 객체.
// key는 유일, value는 중복 가능

// Map중 가장 많이 쓰는 HashMap
import java.util.HashMap;
import java.util.Iterator;

import chapter12_Collection_Framework.Section2_Collection_Framework.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) { // HashMap에 회원을 추가하는 메서드
		hashMap.put(member.getMemberId(), member); // key-value 쌍으로 추가
	}
	
	public boolean removeMember(int memberId) { // HashMap에서 회원을 삭제하는 메서드
		if(hashMap.containsKey(memberId)) { // HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
			hashMap.remove(memberId); // 해당 회원 삭제
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() { // Iterator를 사용해 전체 회원을 출력하는 메서드
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) { // 다음키가 있으면
			int key = ir.next(); // key 값을 가져와서
			Member member = hashMap.get(key); // key로부터 value 가져오기 
			System.out.println(member);
		}
		System.out.println();
	}
}
