package chapter15_Java_IO.Section7_Other_IO_Class;
// RandomAccessFile Class는 입출력 클래스 중 유일하게 파일 입출력을 동시에 할 수 있는 클래스
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); // int 4바이트
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer()); // 파일 포인터 위치를 반환하는 메서드
		rf.writeDouble(3.14); // double 8바이트
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		rf.writeUTF("안녕하세요"); // 수정된 UTF-8 사용 - 한글(3바이트) * 5 + null 문자(2바이트) = 17
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		rf.seek(0);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer()); // 포인터를 맨 처음으로 옮기고 위치를 출력
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer()); // 읽기가 끝난 후 파일 포인터 위치를 출력
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str); // 포인터가 맨 처음으로 옮겨지지 않아서 오류 발생
	}
}
