package EmployeeManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Predicate;

import EmployeeManagement.EmployeeService.ValidateEmployee;

public class EmployeeLambda implements EmployeeInterfcae {
	Map<Integer, Employee> employee = new TreeMap();
	int key = 100;
	public interface ValidateEmployee {
		public boolean check(Employee emp);
	}
	void  validate(Employee emp,Predicate<Employee> val) {
		if(!val.test(emp)){
			System.out.println("invalid values");
		}
		else {
			System.out.println("valid");
		}
	}

	Employee emp = new Employee();
	Scanner sc = new Scanner(System.in);
	
    
	

	@Override
	public void addEmployee() {

		System.out.println("enter employee name");
		String name = sc.nextLine();
		boolean flag = false;
		String rename = "[a-zA-Z ]+";
		while (!flag) {
			if ((!name.isEmpty() && name.matches(rename))) {

				flag = true;

			} else {
				System.out.println("enter only alphabets or please enter ur name");
				name = sc.nextLine();
			}
		}
		System.out.println("enter employee salary");
		Double salary = Double.parseDouble(sc.nextLine());

		System.out.println("enter employee age");
		int age = Integer.parseInt(sc.nextLine());
		boolean bool=true;
		Predicate<Employee> validate=(Employee e)->{return e.getAge()>0&&e.getSalary()>30000;};
  
		validate(emp,validate);
		
		/*
		 * if(res) { System.out.println("valid"); }else {
		 * System.out.println("not valid"); }
		 */
			
		
		
		System.out.println("enter employee designation");
		String des = sc.nextLine();
		boolean flag2 = true;
		while (flag2) {
			if (!des.isEmpty() && des.matches(rename)) {
				flag2 = false;
			} else {
				System.out.println("enter only alphabets");
			}
		}
		employee.put(key++, new Employee(name, salary, des, age));
		System.out.println("employee added successfully");

	}

	@Override
	public void updateEmployee(int uid) {

		System.out.println("enter employee name");
		String name = sc.nextLine();
		boolean flag = false;
		String rename = "[a-zA-Z ]+";
		while (!flag) {
			if ((name.matches(rename))) {

				flag = true;

			} else {
				System.out.println("enter only alphabets");
				name = sc.nextLine();
			}
		}
		System.out.println("enter employee salary");
		Double salary = Double.parseDouble(sc.nextLine());

		System.out.println("enter employee age");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("enter employee designation");
		String des = sc.nextLine();
		employee.get(uid).setName(name);

		employee.get(uid).setSalary(salary);
		employee.get(uid).setAge(age);
		employee.get(uid).setDes(des);
		System.out.println("employee updated successfully");

	}

	@Override
	public void deleteEmployee() {
		System.out.println("enter the key which u want to delete");
		int did = Integer.parseInt(sc.nextLine());
		boolean bool = true;
		while (bool) {
			if (employee.containsKey(did)) {
				employee.remove(did);
				bool = false;
			} else {
				System.out.println("ur entered employee doesnt exist");
			}
		}

	}

	Comparator<Employee> EMPLOYEE_SORT_BY_AGE = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			if (o1 instanceof Employee && o2 instanceof Employee) {
				return ((Employee) o1).getAge() - (((Employee) o2).getAge());
			}
			return 0;
		}
	};

	@Override
	public void listEmployees() {
		List<Employee> employee_sort = new ArrayList<Employee>(employee.values());
		Collections.sort(employee_sort, EMPLOYEE_SORT_BY_AGE);
		if (!employee_sort.isEmpty()) {
			System.out.format("Id\t Name\t Salary\t designation\t Age \n");
			for (Employee entry : employee_sort) {

				System.out.format("%d\t %s\t %s\t %s\t %d \n", entry.getId(), entry.getName(), entry.getSalary(),
						entry.getDes(), entry.getAge());
			}
		} else {
			System.out.println("no data found to display");
		}

	}

	@Override
	public void listEmployeeById() {
		System.out.println("enter the employee key which u want to fetch");
		int kid = Integer.parseInt(sc.nextLine());
		if (employee.containsKey(kid)) {
			System.out.format("Id\t Name\t Salary\t designation\t Age \n");
			System.out.format("%d\t %s\t %s\t %s\t %d \n", employee.get(kid).getId(), employee.get(kid).getName(),
					employee.get(kid).getSalary(), employee.get(kid).getDes(), employee.get(kid).getAge());
		} else {
			System.out.println("employee doesnt exist");
		}

	}

	@Override
	public void printStatistics() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit() {
		System.exit(0);

	}
}
