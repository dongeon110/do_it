package chapter13_Inner_Class.Section4_Exercise;

import java.util.ArrayList;
import java.util.List;

// Exercise Q7

// 1. 모든 책의 가격
// 2. 책의 가격이 2만원 이상인 책의 이름을 정렬하여 출력

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}


public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		// 스트림 생성하고 출력하기
		// 1. 모든 책의 가격
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("모든 책의 가격 : " + total);
		
		
		// 2. 책의 가격이 2만원 이상인 책의 이름 정렬하여 출력
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
	}
}
