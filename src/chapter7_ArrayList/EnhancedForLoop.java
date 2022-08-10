package chapter7_ArrayList;
// 향상된 for문
public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}
}
