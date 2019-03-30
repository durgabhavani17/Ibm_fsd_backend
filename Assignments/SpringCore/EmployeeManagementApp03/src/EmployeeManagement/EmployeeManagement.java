package EmployeeManagement;

import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;



public class EmployeeManagement {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean_Config.xml");
	   EmployeeService1 obj = (EmployeeService1) context.getBean("employee");
		
		Scanner sc=new Scanner(System.in);
		
		boolean bool=false;
		while(!bool) {
			System.out.println("Menu");
			System.out.println("1.add an Employee");
			System.out.println("2.update an Employee");
			System.out.println("3.list of employees");
			System.out.println("4.delete employee by id");
			System.out.println("5.list employee by Id");
			System.out.println("6.print statistics");
			System.out.println("7.Import");
			System.out.println("8.Export");
			System.out.println("9.exit");
			System.out.println("Enter the option which u want to perform");
			int option=Integer.parseInt(sc.nextLine());
		switch(option) {
		case 1:
			try {
			  obj.addEmployee();
			}catch(DateTimeParseException e) {
				System.err.println("enter the date in yyyy/mm/dd format");
			}
			  break;
		case 2:
			System.out.println("enter employee key to update");
		
		      int  uid=Integer.parseInt(sc.nextLine());
			
			obj.updateEmployee(uid);
			break;
		case 3:
			obj.listEmployees();
			break;
		case 4:
			obj.deleteEmployee();
			break;
		case 5:
			obj.listEmployeeById();
			break;
		case 6:
			obj.printStatistics();
			break;
		case 7:
			Callable<Boolean> importThread=new Callable<Boolean>(){

				@Override
				public Boolean call() throws Exception {
					System.out.println(Thread.currentThread()+"triggred"+"wait for 5 sec");
					Thread.sleep(5000);
					obj.importFile();
					return null;
				}
			};
			
			ExecutorService e = Executors.newFixedThreadPool(2);
			Future<Boolean> res=e.submit(importThread);
			
			System.out.println("import triggered");
			e.shutdown();
			
			break;
		case 8:
			Callable<Boolean> exportThread=new Callable<Boolean>(){

				@Override
				public Boolean call() throws Exception {
					System.out.println(Thread.currentThread()+"triggred"+"wait for 5 sec");
					Thread.sleep(5000);
					obj.exportFile();
					return null;
				}
			};
			
			ExecutorService e1 = Executors.newFixedThreadPool(2);
			Future<Boolean> res1=e1.submit(exportThread);
			System.out.println("export triggered");
			e1.shutdown();
			break;
		case 9:
			obj.exit();
			
			break;
		default:
			System.out.println("enter the correct option");
			break;
			
		}
		}

	}

}
