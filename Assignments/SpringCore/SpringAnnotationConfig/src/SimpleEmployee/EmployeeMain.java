package SimpleEmployee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean_Config1.xml");
      //ApplicationContext
		// Retrieving the bean from container
		Employee obj = (Employee) context.getBean("employee");
		

		// Display message
		
		  System.out.println(obj.getId());
		  System.out.println(obj.getAddress());
		   
		  System.out.println(obj);
		 
		// Graceful shutdown of container
		context.registerShutdownHook();


	}

}
