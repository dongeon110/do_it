package chapter15_Java_IO.Section1_Java_IO_and_Stream;
// cmd 켜서 경로에 있는 bin 폴더로 이동한 뒤
// java chapter15_Java_IO.Section1_Java_IO_and_Stream.ConsoleTest 실행
import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름: ");
		String name = console.readLine();
		System.out.println("직업: ");
		String job = console.readLine();
		System.out.println("비밀번호: ");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}
