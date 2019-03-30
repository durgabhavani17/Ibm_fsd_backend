package EmployeeManagement;

import java.sql.SQLException;

public interface EmployeeInterfcae {
	public void addEmployee();

	public void updateEmployee(int id);

	public void deleteEmployee();

	public void listEmployees();

	public void listEmployeeById();

	public void printStatistics();

	public void importFile();

	public void exportFile();

	public void exit();

}
