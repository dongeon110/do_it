package chapter7_ArrayList;
// 객체 배열 만들기2
public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5]; // 각각의 Book 인스턴스 값을 담을 공간 5개를 생성하는 문장
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]); // 5 null 공간
		}
		
		library[0] = new Book("태백산맥", "조쟁래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리"); // 5개 저장
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo(); // 5개 저장값
		}
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]); // 저장된 메모리
		}
	}
}
