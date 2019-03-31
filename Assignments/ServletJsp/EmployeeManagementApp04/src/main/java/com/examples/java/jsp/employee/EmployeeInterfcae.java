
package com.examples.java.jsp.employee;

import java.sql.SQLException;
import java.util.Map;

public interface EmployeeInterfcae {
	public void addEmployee(Employee emp);

	public void deleteEmployee(int did);

	public Map listEmployees();

	public void listEmployeeById(int kid);

	public void importFile();

	public void exportFile();

	public void exit();

	public void updateEmployee(int uid, String name, Double salary, String dob, int age, String des);

}
