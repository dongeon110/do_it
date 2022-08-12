package chapter07_ArrayList;
// 이차원 배열 초기화하기
public class TwoDimension {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println(); // 행 출력 끝나면 한줄 띄우기 
		}
		
		
		// solo coding
		char[][] alphabets = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				System.out.println(alphabets[i][j]);
			}
			System.out.println();
		}
	}
}
