package chapter12_Collection_Framework.Section3_List_Interface;
// ArrayList로 Queue 구현하기
import java.util.ArrayList;

import chapter12_Collection_Framework.Section2_Collection_Framework.Member;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("큐가 비었습니다");
			return null;
		}
		
		return(arrayQueue.remove(0)); // 큐의 맨 앞에서 꺼냄
	}
}


public class QueueTest {
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

	}
}
