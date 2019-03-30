<%@page import="com.examples.java.jsp.employee.EmployeeService1"%>
<%@page import="java.util.Map,com.examples.java.jsp.employee.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list employee</title>
<style type="text/css">
table, td, th {
	border: 2px solid;
	padding: 10px 10px 10px 10px;
}

.btn {
	background-color: #4CAF50;
	color: white;
	padding: 5px 5px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

.btn1 {
	background-color: red;
	color: white;
	padding: 5px 5px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}
</style>
</head>
<body>
	<%
		EmployeeService1 emp = new EmployeeService1();
		Map<Integer, Employee> employee = emp.listEmployees();
		HttpSession ses = request.getSession();
	%>
	<table>
		<tr>
			<th>EmployeeId</th>
			<th>EmployeeName</th>
			<th>EmployeeSalary</th>
			<th>EmployeeDob</th>
			<th>EmployeeAge</th>
			<th>EmployeeDesignation</th>
			<th>EmployeeDepartment</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<%
			for (Employee e : employee.values()) {
				int id = e.getId();
		%>
		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getName()%></td>
			<td><%=e.getSalary()%></td>
			<td><%=e.getDob1()%></td>
			<td><%=e.getAge()%></td>
			<td><%=e.getDes()%></td>
			<td><%=e.getDep()%></td>
			<td><a
				href="updateEmp.jsp?id=<%=e.getId()%>&name=<%=e.getName()%>&salary=<%=e.getSalary()%>&dob=<%=e.getDob1()%>&des=<%=e.getDes()%>"
				class="btn">Edit</a></td>
			<td><a class="btn1" href="delete.do?did=<%=e.getId()%>">Delete</a></td>
		</tr>
		<% 
}
%>
	</table>
</body>
</html>