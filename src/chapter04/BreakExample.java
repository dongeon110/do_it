package chapter04;
// break
public class BreakExample {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum >= 500)
				break;
		}
		
		System.out.println("num: " + num);
		System.out.println("sum: " + sum);
	}
}
