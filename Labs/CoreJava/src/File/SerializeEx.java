package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e = new Employee();
		e.name = "bhavani";
		e.id = 1234;
		e.salary = 450000;

		FileOutputStream out = new FileOutputStream("c:\\html\\out.txt");

		ObjectOutputStream ob = new ObjectOutputStream(out);
		ob.writeObject(e);
		System.out.println("saved");
		FileInputStream in = new FileInputStream("c:\\html\\MyEmpFile.txt");
		ObjectInputStream ob1 = new ObjectInputStream(in);
		Employee ee = null;
		ee = (Employee) ob1.readObject();
		System.out.println("deserialized da is");
		System.out.println(ee.toString());
		ob1.close();
		ob.close();

	}

}
