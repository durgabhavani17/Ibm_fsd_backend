package SimpleEmployee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		
		Employee obj = (Employee) context.getBean("employee");

		

		System.out.println(obj.getId());
		System.out.println(obj.getAddress());
		System.out.println(obj.getDob());
		System.out.println(obj);

		
		context.registerShutdownHook();

	}

}
