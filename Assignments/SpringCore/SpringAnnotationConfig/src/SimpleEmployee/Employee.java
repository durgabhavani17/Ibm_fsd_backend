package SimpleEmployee;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	@Value(value="1")
	public Integer id;
	@Value(value="bhavani")
	
	public String name;
	@Value(value="23")
	public Integer age;
	@Value(value="java")
	public String designation;
	
    @Autowired
	public Address address;
    
    @Value(value="true")
	public boolean contractor;
	

	public Employee() {

	}

	public Employee(Integer id, String name) {

		this.id = id;
		this.name = name;

	}

	public Integer getId() {
		return id;
	}

	

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Employee(Integer id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name  + ", age=" + age + ", designation=" + designation
				+ ", address=" + address + ", contractor=" + contractor + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isContractor() {
		return contractor;
	}

	public void setContractor(boolean contractor) {
		this.contractor = contractor;
	}

}
