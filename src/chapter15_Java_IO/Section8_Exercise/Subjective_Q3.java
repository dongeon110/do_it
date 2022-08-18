package chapter15_Java_IO.Section8_Exercise;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Subjective_Q3 {
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("a.txt")) {
			String s = "지금까지 자바 정말 재미있게 공부했어요^^";
			byte b[] = s.getBytes(); // convert string into byte array
			fos.write(b);
			fos.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
