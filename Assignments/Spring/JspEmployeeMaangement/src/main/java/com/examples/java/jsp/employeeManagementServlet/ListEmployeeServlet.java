package com.examples.java.jsp.employeeManagementServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.java.jsp.employee.EmployeeService1;


public class ListEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	EmployeeService1 emp=new EmployeeService1();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Map<Integer,Employee> employee=emp.listEmployees(); HttpSession
		 * session=request.getSession(); session.setAttribute("employee",
		 * employee.values());
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
