package EmployeeManagement;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee  {
	
	
	
	private static  AtomicInteger idGen=new AtomicInteger(100);
	private  int id;
	private String name;
	private double salary;
	private String des;
	private int age;
	private String dep;
	private LocalDate dob;
	
	

	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", des=" + des + ", age=" + age
				+ ", dep=" + dep + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee() {
		super();
	}
	

	public Employee(String name, double salary, String des, int age,String dep,LocalDate dob) {
		super();

		this.id = idGen.getAndIncrement();
		this.name = name;
		this.salary = salary;
		this.des = des;
		this.age = age;
		this.dep=dep;
		this.dob=dob;
	}
}

	