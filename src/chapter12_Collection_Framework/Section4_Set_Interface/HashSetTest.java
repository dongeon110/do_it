package chapter12_Collection_Framework.Section4_Set_Interface;
// 순서와 상관없이 중복을 허용하지 않는 Set Interface
// 대표적으로 HashSet과 TreeSet이 있음
import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet); // 순서 상관없이 출력 + 중복 X
	}
}
