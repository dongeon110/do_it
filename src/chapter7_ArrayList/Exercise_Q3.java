package chapter7_ArrayList;

public class Exercise_Q3 {
	public static void main(String[] args) {
		int[] intlist = new int[5];
		int sum = 0;
		
		for(int i=0; i<intlist.length; i++) {
			intlist[i] = 2 + 2*i;
			sum += intlist[i];
		}
		
		System.out.println(sum);
	}
}
