package EmployeeManagement;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
	
	
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private double salary;
	private String des;
	private int age;
	private String dep;
	private String dob;
	private Date dob1;
	private LocalDate dob2;
	

	public LocalDate getDob2() {
		return dob2;
	}
	public void setDob2(LocalDate dob2) {
		this.dob2 = dob2;
	}
	public Date getDob1() {
		return dob1;
	}
	public void setDob1(Date dob1) {
		this.dob1 = dob1;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Employee [  name=" + name + ", salary=" + salary + ", des=" + des + ", age=" + age
				+ ", dep=" + dep + "]";
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
	
	

	public Employee(String name, double salary,String dob ,int age, String des,String dep) {
		super();

		
		this.name = name;
		this.salary = salary;
		this.des = des;
		this.age = age;
		this.dep=dep;
		this.dob=dob;
	}
	public Employee(int id, String name2, double salary2, java.util.Date dob2, int age2, String des2, String dep2) {
		this.id=id;
		this.name = name2;
		this.salary = salary2;
		this.des = des2;
		this.age = age2;
		this.dep=dep2;
		this.dob1=dob2;
	}
	public Employee(String string, double parseDouble, LocalDate parse, int age2, String string2, String string3) {
		this.name=string;
		this.salary=parseDouble;
		this.dob2=parse;
		this.age=age2;
		this.des=string2;
		this.dep=string3;
	}
	
}

	