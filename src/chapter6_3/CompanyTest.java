package chapter6_3;
// 변수의 주소값 비교
public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1);
		System.out.println(myCompany1 == myCompany2);
	}
}
