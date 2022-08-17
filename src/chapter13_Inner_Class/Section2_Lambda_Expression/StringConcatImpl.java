package chapter13_Inner_Class.Section2_Lambda_Expression;
// 클래스 vs 람다식
// 클래스 : 추상메서드 구현하기
public class StringConcatImpl implements StringConcat{
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}
}
