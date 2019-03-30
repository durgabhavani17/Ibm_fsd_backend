package EmployeeManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Comparator;

import java.util.List;
import java.util.Map;

import java.util.Scanner;
import java.util.TreeMap;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class EmployeeService1 implements EmployeeInterfcae {
	@Autowired
	public EmployeeService1(EmployeeDao emp) {
		this.emp = emp;
	}

	public EmployeeDao emp;

	public void setEmp(EmployeeDao emp) {
		this.emp = emp;
	}

	public EmployeeDao getEmp() {
		return emp;
	}

	public interface ValidateEmployee {
		public boolean check(int age, double salary);
	}

	// EmployeeDao emp = new EmployeeDao();
	Scanner sc = new Scanner(System.in);

	boolean validate(ValidateEmployee validator, int age, double salary) {
		return validator.check(age, salary);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	Map<Integer, Employee> employee = new TreeMap();
	int key = 100;

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

		String sal = sc.nextLine();
		boolean b = false;
		String str = "[0-9]+";
		while (!b) {
			if (sal.toString().matches(str)) {

				b = true;
			} else {
				System.out.println("enter only numbers");
				sal = sc.nextLine();
			}
		}
		Double salary = Double.parseDouble(sal);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println("enter ur date of birth");

		String dob = sc.nextLine();
		LocalDate dob1 = LocalDate.parse(dob, format);

		LocalDate today = LocalDate.now();
		Period p = Period.between(dob1, today);

		int age = p.getYears();
		boolean flag4 = true;
		while (flag4) {
			boolean ageValue = validate((age1, salary1) -> age1 > 20 && salary1 > 30000

					, age, salary);

			if (ageValue) {
				System.out.println("valid age and salary");
				flag4 = false;
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
				des = sc.nextLine();
			}
		}
		System.out.println("enter employee department");
		String dep = sc.nextLine();
		boolean flag9 = true;
		while (flag9) {
			if (!dep.isEmpty() && dep.matches(rename)) {
				flag9 = false;
			} else {
				System.out.println("enter only alphabets");
				dep = sc.nextLine();
			}
		}

		emp.createUser(new Employee(name, salary, dob, age, des, dep));

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
		String salary2 = sc.nextLine();

		String str = "[0-9]+";
		boolean flag1 = false;
		while (!flag1) {
			if ((salary2.matches(str))) {

				flag1 = true;

			} else {
				System.out.println("enter only numbers");
				salary2 = sc.nextLine();
			}
		}
		Double salary = Double.parseDouble(salary2);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println("enter ur date of birth");
		String dob = sc.nextLine();
		LocalDate dob1 = LocalDate.parse(dob, format);

		LocalDate today = LocalDate.now();
		Period p = Period.between(dob1, today);

		int age = p.getYears();
		boolean flag2 = true;
		while (flag2) {
			boolean ageValue = validate((age1, salary1) -> age1 > 20 && salary1 > 30000

					, age, salary);

			if (ageValue) {
				System.out.println("valid age and salary");
				flag2 = false;
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
		boolean flag3 = true;
		while (flag3) {
			if (!des.isEmpty() && des.matches(rename)) {
				flag3 = false;
			} else {
				System.out.println("enter only alphabets");
			}
		}

		emp.updateUser(name, salary, dob, age, des, uid);

	}

	@Override
	public void deleteEmployee() {
		System.out.println("enter the key which u want to delete");
		int did = Integer.parseInt(sc.nextLine());
		emp.deleteEmployee(did);

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

	@SuppressWarnings("unchecked")
	@Override
	public void listEmployees() {
		employee = emp.displayUsers();

	}

	@Override
	public void listEmployeeById() {
		System.out.println("enter the employee key which u want to fetch");
		int kid = Integer.parseInt(sc.nextLine());
		emp.displayUsersById(kid);

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void printStatistics() {
		Map<String, Long> count1;
		Map<String, Double> avgAge;
		long count2 = 0;
		long countValue = employee.size();
		double avgSal = 0;
		@SuppressWarnings("unused")
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
				.entrySet().stream().filter(e -> e.getValue() >= 3).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(totalMore2);
		List<String> slist = list.stream().filter(e -> e.getName().startsWith("s")).map(Employee::getName)
				.collect(Collectors.toList());

		System.out.println(slist);
		Map<String, Long> ordlist = list.stream()
				.collect(Collectors.groupingBy(Employee::getDep, Collectors.counting())).entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry::getValue))
				.collect(Collectors.groupingBy(Map.Entry::getKey, TreeMap::new, Collectors.counting()));

		System.out.println(ordlist);
	}

	@Override
	public void exit() {
		emp.exit();

	}

	@Override
	public synchronized void importFile() {
		Employee ee = null;

		try {
			BufferedReader in = new BufferedReader(new FileReader("c:\\html\\MyEmpFile.txt"));
			String s;
			int count = 0;
			while ((s = in.readLine()) != null) {
				count++;
				String[] var = s.split(",");
				LocalDate today = LocalDate.now();
				Period p = Period.between(LocalDate.parse(var[2]), today);

				int age = p.getYears();

				emp.createUser(new Employee(var[0], Double.parseDouble(var[1]), var[2], age, var[3], var[4]));
			}
			System.out.println(count + "records imported");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public synchronized void exportFile() {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("c:\\html\\MyEmpFile1.txt"));
			for (Employee emp : employee.values()) {
				out.write(emp.getName() + "," + emp.getId() + "," + emp.getAge() + "," + emp.getDep() + ","
						+ emp.getDes() + "," + emp.getDob1());

				out.newLine();
				out.flush();
			}
			System.out.println("exported");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
