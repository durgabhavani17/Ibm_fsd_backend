package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(new BufferedReader(new FileReader("c:\\html\\MyEmpFile.txt")));
      while(s.hasNextLine()) {
    	  System.out.println(s.nextLine());
      }
		/*
		 * //if u want to conevert bytestream in character stream 
		 * //Scanner s=new
		 * Scanner(new BufferedReader(new InputStreamReader(new FileInputstream
		 * //("c:\\html\\key.text"))); 
		 * //while(s.hasNextLine()) {
		 * //System.out.println(s.nextLine());
		 */ 
	}

}
