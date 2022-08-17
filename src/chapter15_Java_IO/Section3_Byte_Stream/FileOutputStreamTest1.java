package chapter15_Java_IO.Section3_Byte_Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")) {
//			// fos = new FileOutputStream("output.txt", true); // 로 true 매개변수를 추가하면 덮어쓰지 않고 이어서 출력
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
