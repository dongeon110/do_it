package chapter15_Java_IO.Section1_Java_IO_and_Stream;
// System.in으로 화면에서 문자 입력받기
import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
