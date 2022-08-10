package chapter7_ArrayList;
// 2차원 배열의 길이 출력
public class TwoDimension2 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(arr.length); // 행 길이 2행
		System.out.println(arr[0].length); // 열 길이 3열
	}
}
