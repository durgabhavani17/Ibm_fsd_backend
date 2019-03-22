package File;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		File file=new File("c:\\html");
		System.out.println("Is directory"+file.isDirectory());
		System.out.println("absolute path"+file.getAbsolutePath());
		System.out.println(file.lastModified());
		for(File f:file.listFiles())
		{
			System.out.println(f.getName()+(f.isDirectory()?"is a directory":"is a file"));
		}
	}

}
