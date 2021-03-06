package com.examples.java.jsp.employeeManagementServlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.java.jsp.employee.EmployeeService1;

/**
 * Servlet implementation class UpdateEmployeeServlet
 */
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeService1 emp = new EmployeeService1();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		String dob = request.getParameter("dob");
		String designation = request.getParameter("des");
		LocalDate dob1 = LocalDate.parse(dob);
		Period period = Period.between(dob1, LocalDate.now());
		int age = period.getYears();
		String des = request.getParameter("des");
		response.sendRedirect("homePage.jsp");

		emp.updateEmployee(Integer.parseInt(id), name, Double.parseDouble(salary), dob, age, designation);

	}

}
