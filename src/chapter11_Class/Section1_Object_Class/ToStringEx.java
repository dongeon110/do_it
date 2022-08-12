package chapter11_Class.Section1_Object_Class;
// Object Class의 toString() 메서드
class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString()); // 인스턴스의 정보(클래스 이름.주소값)을 보여줌 (Override X)
		// 이 값은 "클래스이름@해시코드값" 임. (Override X)
	}
}
