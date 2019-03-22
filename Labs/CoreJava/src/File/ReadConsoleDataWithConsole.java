package File;

import java.io.Console;

public class ReadConsoleDataWithConsole {

	public static void main(String[] args) {
		Console c=System.console();
		if(c==null) {
			System.exit(0);
		}
		String name=c.readLine("enter ur name");
		String password=c.readLine("enter ur password");
		System.out.println(name+" "+password);

	}

}
