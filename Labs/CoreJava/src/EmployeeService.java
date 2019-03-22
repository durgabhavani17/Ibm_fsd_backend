package EmployeeManagement;

import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class EmployeeService implements EmployeeInterfcae {
	public interface ValidateEmployee {
		public boolean check(int age, double salary);
	}

	Employee emp = new Employee();
	Scanner sc = new Scanner(System.in);

	boolean validate(ValidateEmployee validator, int age, double salary) {
		return validator.check(age, salary);
	}

	Map<Integer, Employee> employee = new TreeMap();
	int key = 100;
	@Override
	public synchronized void importFile() {
		
		
		Employee ee = null;
		
		try {
			 BufferedReader in = new BufferedReader(new FileReader("c:\\html\\MyEmpFile.txt"));
			    String s;
                int count = 0;
			    while((s = in.readLine()) != null){
                      count++;
			        String[] var = s.split(",");
			        LocalDate today=LocalDate.now();
			        Period p=Period.between(LocalDate.parse(var[2]), today);
					
					int age = p.getYears();
			             //var[0]=MALE etc etc
			        employee.put(key++,new Employee(var[0],Integer.parseInt(var[1]),var[3],age,var[4],LocalDate.parse(var[2])));
			    }
             System.out.println(count  +"records imported");
			}catch(Exception e){
			    e.printStackTrace();
			}
		
		
	}

	@Override
	public synchronized void exportFile() {
		  

		try {
			 BufferedWriter out = new BufferedWriter(new FileWriter("c:\\html\\MyEmpFile1.txt"));
			 for(Employee emp:employee.values()) {
			   out.write(emp.getName()+","+emp.getId()+","+emp.getAge()+","+emp.getDep()+","+emp.getDes()+","+emp.getDob());
			 
			   out.newLine();
			   out.flush();
			 }
			   System.out.println("exported");

			    
			}catch(Exception e){
			    e.printStackTrace();
			}
		
		
	    }

		
	

	

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
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println("enter ur date of birth");
		
		LocalDate dob=LocalDate.parse(sc.nextLine(),format);
		
        LocalDate today=LocalDate.now();
        Period p=Period.between(dob, today);
		
		int age = p.getYears();
		boolean flag1 = true;
		while (flag1) {
			boolean ageValue = validate((age1, salary1) -> age1 > 20 && salary1 > 30000

					, age, salary);

			if (ageValue) {
				System.out.println("valid age and salary");
				flag1 = false;
			} else {
				System.out.println("invalid age or salary");
				System.out.println("enter employee age");
				age = Integer.parseInt(sc.nextLine());
				System.out.println("enter employee salary");
				salary = Double.parseDouble(sc.nextLine());
			}
		}
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
		System.out.println("enter employee department");
		String dep = sc.nextLine();
		
		employee.put(key++, new Employee(name, salary, des,age,dep,dob));
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
		boolean flag1 = true;
		while (flag1) {
			boolean ageValue = validate((age1, salary1) -> age1 > 20 && salary1 > 30000

					, age, salary);

			if (ageValue) {
				System.out.println("valid age and salary");
				flag1 = false;
			} else {
				System.out.println("invalid age or salary");
				System.out.println("enter employee age");
				age = Integer.parseInt(sc.nextLine());
				System.out.println("enter employee salary");
				salary = Double.parseDouble(sc.nextLine());
			}
		}
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
		Map<String, Long> count1;
		Map<String, Double> avgAge;
		long count2 = 0;
		long countValue = employee.size();
		double avgSal = 0;
		Map<String, Long> list3Dep;
		List emp = new ArrayList();
		List<Employee> list = new ArrayList<Employee>(employee.values());
		count2 = list.stream().filter(e -> e.getAge() < 30).count();
		System.out.println("no of employees age older than 30 is" + count2);
		emp = list.stream().filter(e -> e.getAge() < 30).map(e -> e.getId()).collect(Collectors.toList());
		System.out.println("list employee Ids older than 30 years" + emp);
		count1 = list.stream().collect(Collectors.groupingBy(Employee::getDep, Collectors.counting()));
		System.out.println("no of employees in each departament" + count1);
		double totSalary = list.stream().map(Employee::getSalary)
				.reduce(0.0, (a, b) -> a.doubleValue() + b.doubleValue()).doubleValue();
		System.out.println("total salary is:" + totSalary);
		double avgSalary = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("average of salary is" + avgSalary);
		avgAge = list.stream()
				.collect(Collectors.groupingBy(Employee::getDep, Collectors.averagingInt(Employee::getAge)));
		System.out.println("avg age of employees by department" + avgAge);

		List<String> totalMore2 = list.stream().collect(Collectors.groupingBy(Employee::getDep, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 3).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(totalMore2);
		List<String> slist = list.stream().filter(e -> e.getName().startsWith("s")).map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println(slist);
		Map<String, Long> ordlist = count1.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
				.collect(Collectors.groupingBy(Map.Entry::getKey, TreeMap::new, Collectors.counting()));
		System.out.println(ordlist);
	}

	@Override
	public void exit() {
		System.exit(0);

	}

}
