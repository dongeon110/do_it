package chapter13_Inner_Class.Section4_Exercise;
// Exercise Q5
public class CalcTest {
	public static void main(String[] args) {
		Calc calc = (x, y) -> x + y;
		int x = calc.add(10, 20);
		System.out.println(x);
	}
}
