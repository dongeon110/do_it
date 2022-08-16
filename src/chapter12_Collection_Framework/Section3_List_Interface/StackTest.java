package chapter12_Collection_Framework.Section3_List_Interface;
// ArrayList로 Stack 구현하기
import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size(); // ArrayList에 저장된 유효한 자료의 개수
		if(len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		
		return (arrayStack.remove(len-1));
	}
}

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
