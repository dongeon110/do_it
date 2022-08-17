package chapter15_Java_IO.Section3_Byte_Stream;
// 파일 끝까지 읽기
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input.txt")) { // 프로젝트 플더
			int i;
			while ((i = fis.read()) != -1) { // i 값이 -1이 아닌 동안 read() 메서드로 한 바이트를 반복해 읽음
//				// read() Method로 파일을 읽는 경우 파일의 끝에 도달하면 -1을 반환
				
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}