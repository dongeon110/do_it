package chapter15_Java_IO.Section7_Other_IO_Class;
// File 클래스 테스트하기
import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\user\\git\\do_it\\newFile.txt"); // 아직 생성 X
		file.createNewFile(); // 실제 파일 생성
		
		
		// 파일의 속성을 살펴보는 메서드 호출
		System.out.println(file.isFile()); // T
		System.out.println(file.isDirectory()); // F
		System.out.println(file.getName()); // newFile.txt
		System.out.println(file.getAbsolutePath()); // 경로
		System.out.println(file.getPath()); // 경로
		System.out.println(file.canRead()); // T
		System.out.println(file.canWrite()); // T
		
		file.delete(); // 파일 삭제
	}
}
