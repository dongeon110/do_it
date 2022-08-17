package chapter15_Java_IO.Section3_Byte_Stream;
// write(byte[] b)
// 파일에 바이트 배열로 출력하기
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output2.txt", true); // true - 연결해서 작성
		try(fos) {
			byte[] bs = new byte[26];
			byte data = 65; // 'A'의 아스키 값
			
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
