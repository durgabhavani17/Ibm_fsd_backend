package Spring;

import java.time.LocalDate;
import java.util.List;

public class Employee {
	public Integer id;
	public String name;
	public int age;
	public String designation;
	public List skills;
	public Address address;
	public LocalDate dob;
	public boolean contractor;
	public Employee() {
		
	}
	 public Integer getId() {
		return id;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
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
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation + ", skills="
				+ skills + ", address=" + address + ", contractor=" + contractor + "]";
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
	public List getSkills() {
		return skills;
	}
	public void setSkills(List skills) {
		this.skills = skills;
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
