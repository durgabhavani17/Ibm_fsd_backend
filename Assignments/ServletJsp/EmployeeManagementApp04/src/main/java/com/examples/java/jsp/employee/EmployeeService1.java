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
