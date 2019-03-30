package SimpleEmployee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable

public class EmployeeConfiguration {
	@Bean
	public Employee employee() {
		return new Employee(100, "bhavani", LocalDate.parse("1997-03-02"), 21, "java", list(), address(), false);
	}

	public List list() {
		ArrayList list = new ArrayList();
		list.add("java");
		list.add("oracle");
		return list;
	}

	@Bean
	public Address address() {
		return new Address("anantapur", "india", 515741);
	}

}
