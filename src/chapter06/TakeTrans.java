package chapter06;
// 6-2 객체 간 협력, example
public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		// 180p 예제
		Student studentEdward = new Student("Edward", 20000);
		
		Taxi taxi222 = new Taxi(222);
		studentEdward.takeTaxi(taxi222, 10000);
		studentEdward.showInfo();
		taxi222.showInfo();
	}
}
