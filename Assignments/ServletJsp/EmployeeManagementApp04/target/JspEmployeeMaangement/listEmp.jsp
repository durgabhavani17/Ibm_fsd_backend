<%@page import="com.examples.java.jsp.employeeManagementServlet.EmployeeService1"%>
<%@page import="java.util.Map,com.examples.java.jsp.employeeManagementServlet.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list employee</title>
<style type="text/css">
table,td,th{
border:2px solid;
}
</style>
</head>
<body>
<%
EmployeeService1 emp=new EmployeeService1(); 
Map<Integer,Employee> employee=emp.listEmployees();
HttpSession ses=request.getSession();

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
<th>Action</th>
</tr>

<% 
for(Employee e:employee.values())
{
	int id=e.getId();
	%>
	<tr>
	<td><%=e.getId() %></td>
	<td><%=e.getName() %></td>
	<td><%=e.getSalary() %></td>
	<td><%=e.getDob1() %></td>
	<td><%=e.getAge() %></td>
	<td><%=e.getDes()%></td>
	<td><%=e.getDep() %></td>
	<td><a href="upadate.jsp?id=<%=e.getId() %>&name=<%=e.getName()%>&salary=<%=e.getSalary()%>&dob=<%=e.getDob1()%>&des=<%=e.getDes()%>">Edit</a>  
	<a href="delete.do?did=<%=e.getId()%>">Delete</a></td>
	
	</tr>
<% 
}
%>
</table>
</body>
</html>