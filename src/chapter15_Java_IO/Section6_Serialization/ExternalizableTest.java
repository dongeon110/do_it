package chapter15_Java_IO.Section6_Serialization;
// 직렬화 테스트 하기

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable {
	String name;
	
	public Dog() {} // 복원할 때 디폴트 생성자가 호출되므로 디플트 생성자를 추가해줘야 함.
	
	// Externalizable Interface의 메서드 구현 (write, read)
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}
	
	public String toString() {
		return name;
	}
}


public class ExternalizableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog myDog = new Dog();
		myDog.name = "멍멍이";
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try(fos; oos) {
			oos.writeObject(myDog);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject();
		System.out.println(dog);
	}
}
