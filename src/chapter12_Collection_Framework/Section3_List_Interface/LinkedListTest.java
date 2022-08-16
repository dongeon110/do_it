package chapter12_Collection_Framework.Section3_List_Interface;
// LinkedList Class 에서만 제공하는 메서드 사용해보기
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList); // A B C
		
		myList.add(1, "D"); // Linked의 첫번째 위치에 D 추가
		System.out.println(myList); // A D B C
		
		myList.addFirst("0");
		System.out.println(myList); // 0 A D B C
		
		System.out.println(myList.removeLast()); // remove C
		System.out.println(myList); // 0 A D B
	}
}
