package chapter13_Inner_Class.Section3_Stream;
// 정수 배열에 스트림 생성하고 사용하기
import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum(); // sum() 연산으로 arr배열에 저장된 값을 모두 더함
		int count = (int)Arrays.stream(arr).count(); // count() 연산으로 arr배열의 요소 개수를 반환함
		// (int) = count()메서드의 반환값이 long 이므로 int형으로 변환
		
		System.out.println(sumVal);
		System.out.println(count);
	}
}
