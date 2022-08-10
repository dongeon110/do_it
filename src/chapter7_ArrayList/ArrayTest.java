package chapter7_ArrayList;
// ArrayList 7-1
public class ArrayTest {
	public static void main(String[] args) {
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
			System.out.println(num[i]);
		}
		
		System.out.println(sum);
		
		int[] arr = new int[] {3, 6, 9 , 12};
		System.out.println(arr[0] + 2); // 5
		System.out.println(arr[1] + arr[2]); // 15
	}
}
