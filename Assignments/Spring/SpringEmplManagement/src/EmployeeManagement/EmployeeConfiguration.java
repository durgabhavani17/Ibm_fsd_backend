package EmployeeManagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {
	@Bean
	public EmployeeDao employeeDao() {
		return new EmployeeDao("com.mysql.jdbc.Driver","jdbc:mysql://localhost/Employee_Management","root","");
	}
	@Bean
	public EmployeeService1 employee() {
		return new EmployeeService1(employeeDao());
		
	}

}
