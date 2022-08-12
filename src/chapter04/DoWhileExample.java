package chapter04;
// do - while문 (일단 do 1번 실행하고 while 반복)
public class DoWhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}
