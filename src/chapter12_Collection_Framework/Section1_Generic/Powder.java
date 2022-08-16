package chapter12_Collection_Framework.Section1_Generic;

public class Powder extends Material{ // 재료 제한을 위한 extends
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Powder입니다";
	}
	
}
