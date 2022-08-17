package chapter14_Exception.Section1_Exception_Class;
// try-catch
public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for(int i=0; i<=5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("에외 처리 부분");
		}
		
		System.out.println("프로그램 종료");
	}
}
