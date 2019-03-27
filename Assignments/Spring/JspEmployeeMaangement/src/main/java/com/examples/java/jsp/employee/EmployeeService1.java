package com.examples.java.jsp.employee;

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
	

	EmployeeDao emp = new EmployeeDao();
	Scanner sc = new Scanner(System.in);

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	Map<Integer, Employee> employee = new TreeMap();
	int key = 100;

	@Override
	public void addEmployee(Employee employee) {


		emp.createUser(employee);

	}

	@Override
	public void updateEmployee(int uid, String name, Double salary, String dob, int age, String des) {

		
		emp.updateUser(name, salary, dob, age, des, uid);

	}

	@Override
	public void deleteEmployee(int did) {
		
		emp.deleteEmployee(did);

	}

	

	@SuppressWarnings("unchecked")
	@Override
	public Map listEmployees() {
		employee = emp.displayUsers();
		return employee;

	}

	@Override
	public void listEmployeeById(int kid) {
		
		emp.displayUsersById(kid);

	}

	/*
	 * @SuppressWarnings("rawtypes")
	 * 
	 * @Override public void printStatistics() { Map<String, Long> count1;
	 * Map<String, Double> avgAge; long count2 = 0; long countValue =
	 * employee.size(); double avgSal = 0;
	 * 
	 * @SuppressWarnings("unused") Map<String, Long> list3Dep; List emp = new
	 * ArrayList(); List<Employee> list = new
	 * ArrayList<Employee>(employee.values()); count2 = list.stream().filter(e ->
	 * e.getAge() < 30).count();
	 * 
	 * System.out.println("no of employees age older than 30 is" + count2); emp =
	 * list.stream().filter(e -> e.getAge() < 30).map(e ->
	 * e.getId()).collect(Collectors.toList());
	 * 
	 * System.out.println("list employee Ids older than 30 years" + emp); count1 =
	 * list.stream().collect(Collectors.groupingBy(Employee::getDep,
	 * Collectors.counting()));
	 * 
	 * System.out.println("no of employees in each departament" + count1); double
	 * totSalary = list.stream().map(Employee::getSalary) .reduce(0.0, (a, b) ->
	 * a.doubleValue() + b.doubleValue()).doubleValue();
	 * 
	 * System.out.println("total salary is:" + totSalary); double avgSalary =
	 * list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
	 * 
	 * System.out.println("average of salary is" + avgSalary); avgAge =
	 * list.stream() .collect(Collectors.groupingBy(Employee::getDep,
	 * Collectors.averagingInt(Employee::getAge)));
	 * System.out.println("avg age of employees by department" + avgAge);
	 * 
	 * List<String> totalMore2 =
	 * list.stream().collect(Collectors.groupingBy(Employee::getDep,
	 * Collectors.counting())) .entrySet().stream().filter(e -> e.getValue() >=
	 * 3).map(Map.Entry::getKey).collect(Collectors.toList());
	 * 
	 * System.out.println(totalMore2); List<String> slist = list.stream().filter(e
	 * -> e.getName().startsWith("s")).map(Employee::getName)
	 * .collect(Collectors.toList());
	 * 
	 * System.out.println(slist); Map<String, Long> ordlist = list.stream()
	 * .collect(Collectors.groupingBy(Employee::getDep,
	 * Collectors.counting())).entrySet().stream()
	 * .sorted(Comparator.comparing(Map.Entry::getValue))
	 * .collect(Collectors.groupingBy(Map.Entry::getKey, TreeMap::new,
	 * Collectors.counting()));
	 * 
	 * System.out.println(ordlist); }
	 */

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
