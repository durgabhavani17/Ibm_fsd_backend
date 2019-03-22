package Examples;
import java.util.Scanner;

public class EmployeeArray {
	int Id;
    String Name;
    int Age;
    long Salary;

    void GetData()           
    {

        Scanner sc = new Scanner(System.in);
        

        System.out.print("\n\tEnter Employee Id : ");
        Id = Integer.parseInt(sc.nextLine());

        System.out.print("\n\tEnter Employee Name : ");
        Name = sc.nextLine();

        System.out.print("\n\tEnter Employee Age : ");
        Age = Integer.parseInt(sc.nextLine());

        System.out.print("\n\tEnter Employee Salary : ");
        Salary = Integer.parseInt(sc.nextLine());

    }

    void PutData()          
    {
        System.out.println("\n\t" + Id + "\t" +Name + "\t" +Age + "\t" +Salary);
    }
    void  updateData() {
    	Scanner scr=new Scanner(System.in);
    	System.out.println("enter ur name to update");
    	Name = scr.nextLine();
    	
    }
    void deleteData() {
    	Name="";
    	Id=0;
    	Age=0;
    	Salary=0;
    	
    }

    public static void main(String args[])
    { 

        EmployeeArray[] Emp = new EmployeeArray[2];
        int i;

        for(i=0;i<2;i++)
            Emp[i] =  new EmployeeArray();   

        for(i=0;i<2;i++)
        {
            System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
            Emp[i].GetData();
        }

        System.out.print("\nDetails of Employees\n");
        for(i=0;i<2;i++)
            Emp[i].PutData();
        
        	Emp[0].updateData();
       
        System.out.print("\n updated Details of Employees\n");
        for(i=0;i<2;i++)
            Emp[i].PutData();
        Emp[1].deleteData();
        System.out.print("\nDetails of Employees after deletion\n");
        for(i=0;i<2;i++)
            Emp[i].PutData();
    }
}


