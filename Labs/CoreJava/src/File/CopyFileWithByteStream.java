package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileWithByteStream {

	public static void main(String[] args) throws IOException {

		try(FileInputStream in=new FileInputStream("C:\\html\\key.txt");
				FileOutputStream out=new FileOutputStream("c:\\html\\key1.txt");) {
		
		
		int c;
		while((c=in.read())!=-1) {
			out.write(c);
		}
		}catch(FileNotFoundException f) {
			System.err.println("error occured"+f.getMessage());
		}catch(IOException i) {
			System.err.println("error occured"+i.getMessage());
		}
		System.out.println("file copied successfully");

	}

}
