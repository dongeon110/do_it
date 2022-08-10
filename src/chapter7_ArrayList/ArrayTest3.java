package chapter7_ArrayList;
// ArrayList 7-1 배열의 유효한 값
public class ArrayTest3 {
	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		for(int i=0; i<size; i++) {
			System.out.println(data[i]);
		}
	}
}
