package EmployeeManagement;

import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import Threads.ConcurrentApi.MyCallable;

public class EmployeeManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		EmployeeService emp=new EmployeeService();
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
			  emp.addEmployee();
			}catch(DateTimeParseException e) {
				System.err.println("enter the date in yyyy/mm/dd format");
			}
			  break;
		case 2:
			System.out.println("enter employee key to update");
		
		      int  uid=Integer.parseInt(sc.nextLine());
			
			emp.updateEmployee(uid);
			break;
		case 3:
			emp.listEmployees();
			break;
		case 4:
			emp.deleteEmployee();
			break;
		case 5:
			emp.listEmployeeById();
			break;
		case 6:
			emp.printStatistics();
			break;
		case 7:
			Callable<Boolean> importThread=new Callable<Boolean>(){

				@Override
				public Boolean call() throws Exception {
					System.out.println(Thread.currentThread()+"triggred");
					Thread.sleep(1000);
					emp.importFile();
					return null;
				}
			};
			
			ExecutorService e = Executors.newFixedThreadPool(2);
			Future<Boolean> res=e.submit(importThread);
			
			System.out.println("import triggered");
			
			break;
		case 8:
			Callable<Boolean> exportThread=new Callable<Boolean>(){

				@Override
				public Boolean call() throws Exception {
					Thread.sleep(1000);
					emp.exportFile();
					return null;
				}
			};
			
			ExecutorService e1 = Executors.newFixedThreadPool(2);
			Future<Boolean> res1=e1.submit(exportThread);
			System.out.println("export triggered");
			break;
		case 9:
			emp.exit();
			break;
		default:
			System.out.println("enter the correct option");
			break;
			
		}
		}

	}

}
