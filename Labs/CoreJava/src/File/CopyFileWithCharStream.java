package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileWithCharStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
  try(FileReader in=new FileReader("c:\\html\\key.txt");FileWriter out=new FileWriter("c:\\html\\key3.txt",true)){
	  int c;
	  while((c=in.read())!=-1) {
		  out.write(c);
	  }
  }catch(IOException i) {
   System.err.println("error occured"+i.getMessage());

	}
  System.out.println("file copied successfully");

}
}