package chapter12_Collection_Framework.Section1_Generic;
// GenericPrinter<T> 클래스 정의
public class GenericPrinter<T extends Material> { // 재료 제한을 위한 <T extends Material>
	private T material; // T 자료형으로 선언한 변수
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() { // <T extends Material>로 선언하면 상위 클래스(Material)의 메소드를 사용할 수 있다.
		material.doPrinting();
	}
}

