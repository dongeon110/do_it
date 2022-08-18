package chapter15_Java_IO.Section4_Character_Stream;
// Writer로 쓰기
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A'); // 문자 1개
			
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf); // 문자 배열
			
			fw.write("안녕하세요. 잘 써지네요"); // 문자열
			
			fw.write(buf, 1, 2); // 문자 배열 일부 출력
			
			fw.write("65"); // 숫자 그대로
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
	}
}
