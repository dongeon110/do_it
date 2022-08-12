package chapter10_interface;
import java.util.ArrayList;

public class Dashinsert {
	
	static String func(String str) {
		String[] list = str.split("");
		ArrayList<Integer> intlist = new ArrayList<>();
		
		for(int i=0; i<list.length; i++) {
			int j = Integer.parseInt(list[i]);
			intlist.add(j);
		}
		
		String ans = "";
		
		for(int i=1; i<intlist.size(); i++) {
			int a = intlist.get(i-1);
			int b = intlist.get(i);
			
			ans += a;
			
			String insert;
			if (a%2==0 && b%2==0) {
				insert = "*";
			} else if (a%2==1 && b%2==1) {
				insert = "-";
			} else {
				insert = "";
			}
			
			ans += insert;
			
		}
		ans += intlist.get(intlist.size()-1);
		return ans;
	}
	
	
	public static void main(String[] args) {
		String str = "4546793";
		System.out.println(func(str));
	}
}