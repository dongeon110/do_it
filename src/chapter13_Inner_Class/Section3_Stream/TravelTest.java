package chapter13_Inner_Class.Section3_Stream;
// 시나리오
// 1. 고객 명단 출력
// 2. 여행의 총 비용 계산
// 3. 고객 중 20세 이상인 사람의 이름 정렬하여 출력
import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		// 1. 고객 명단 순서대로 출력
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s->System.out.println(s));
		
		
		// 2. 여행의 총 비용 계산
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행비용은 : " + total + "입니다.");
		
		
		// 3. 20세 이상 정렬하여 출력
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
