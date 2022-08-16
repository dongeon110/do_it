package chapter12_Collection_Framework.Section1_Generic;
// GenericPrinter<T> 클래스 사용
public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); // Powder형으로 GenericPrinter 클래스 생성
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>(); // Plastic형으로 GenericPrinter 클래스 생성
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}
}

/* 제네릭에서 대입된 자료형을 명시하지 않는 경우
 * 
 * GenericPrinter powderPrinter2 = new GenericPrinter(); // <Powder> 명시하지 않음.
 * powderPrinter2.setMaterial(new Powder());
 * Powder powder = (Powder)powderPrinter.getMaterial(); // (Powder)로 강제 형 변환
 * System.out.println(powderPrinter);
 * 
 * get 에서 강제 형 변환 필요.
 * 
 * 만약 여러 자료형을 동시에 사용하려면 Object 클래스를 사용할 수 있음.
 */
