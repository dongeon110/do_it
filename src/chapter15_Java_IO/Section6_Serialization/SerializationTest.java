package chapter15_Java_IO.Section6_Serialization;
// 직렬화 테스트하기
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// 직렬화에 사용할 Person 클래스
class Person implements Serializable {
	private static final long serialVersionUID = -1503252402544036183L; // 버전 관리를 위한 정보
	// 자바 설치 경로의 bin\serialver.exe 를 사용하면 serialVersionID 가 생성됨. 이 정보를 클래스 파일에 적어주면 됨.
	// 이클립스에서는 자동 경고 뜨고 -> Add generated serial version ID 선택하면 자동 생성. ID 부분 주석 처리하면 볼 수 있음.
	
	String name;
	String job;
//	transient String job; // 직렬화 하고 싶지 않은 변수는 transient
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
}



public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personAhn);
			oos.writeObject(personKim); // 파일에 씀 = 직렬화
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject(); // 역직렬화
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
