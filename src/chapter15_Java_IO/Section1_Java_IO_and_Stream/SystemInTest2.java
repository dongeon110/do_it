package chapter15_Java_IO.Section1_Java_IO_and_Stream;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			while((i = System.in.read()) != '\n') { // 한바이트씩 읽어들임
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
