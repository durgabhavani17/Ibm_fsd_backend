package Examples;

import java.util.Scanner;

public class ScannerEx {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter ur name");
	   String name=sc.nextLine();
	   System.out.println("enter ur age");
	   int age=Integer.parseInt(sc.nextLine());
	   System.out.println("enter ur salary");
	   int salary=Integer.parseInt(sc.nextLine());
	   System.out.println("name \t age \t salary\t");
	   System.out.print(name+","+age+","+salary);
	   
   }
}
